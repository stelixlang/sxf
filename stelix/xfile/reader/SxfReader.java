package stelix.xfile.reader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import stelix.xfile.ISxfBlock;
import stelix.xfile.SxfArrayBlock;
import stelix.xfile.SxfDataBlock;
import stelix.xfile.SxfStruct;
import stelix.xfile.SxfFile;
import stelix.xfile.attributes.SxfField;
import stelix.xfile.attributes.SxfObject;
import stelix.xfile.gen.SxfLexer;
import stelix.xfile.gen.SxfParser;
import stelix.xfile.utils.Tuple;
import stelix.xfile.utils.type;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class SxfReader {

    public static SxfFile readFile(File file) {
        StringBuilder sb = new StringBuilder(512);
        try {
            Reader r = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
            int c = 0;
            while ((c = r.read()) != -1) {
                sb.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        try {
            return readRaw(sb.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }


    public static SxfFile readRaw(String data)  {
        SxfParser sxfParser = new SxfParser(new CommonTokenStream(new SxfLexer(CharStreams.fromString(data))));

        SxfFile sxfFile = new SxfFile();

        for (ParseTree children : sxfParser.file().children) {
            if (children instanceof SxfParser.ObjectContext) {
                SxfParser.ObjectContext context = (SxfParser.ObjectContext) children;
                Tuple<String, ISxfBlock> sxfBlock = getBlock(context);
                sxfFile.blocks().put(sxfBlock.getFirst(), sxfBlock.getSecond());
            }
        }

        return sxfFile;
    }

    public static <X> X readObject(Class<X> classType, String data) {
        try {
            SxfObject sxfObject = classType.getAnnotation(SxfObject.class);
            SxfFile sxfFile = readRaw(data);
            return readObject(classType, sxfFile.dataBlock(sxfObject.name()));
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static <X> X readObject(Class<X> classType, SxfDataBlock dataBlock) { ;
        try {
            X instance = classType.newInstance();
            for (Field field : classType.getFields()) {
                final SxfField sxfField = field.getAnnotation(SxfField.class);
                final String[] parents = sxfField.name().contains("/") ? sxfField.name().split("/") : null;
                final String name = parents == null ? sxfField.name() : parents[parents.length - 1];
                SxfDataBlock currentBlock = dataBlock;

                if (parents != null) {
                    for (int i = 0; i < parents.length - 1; i++) {
                        currentBlock = currentBlock.dataBlock(parents[i]);
                    }
                }
                if (field.getType().isPrimitive()) {
                    field.set(instance,  currentBlock.variable(name));
                } else {
                    if (type.is_class_type_or(field.getType(), List.class, ArrayList.class)) {

                        SxfArrayBlock sxfArrayBlock = currentBlock.arrayBlock(name);
                        Class<?> typeOfElement = (Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];

                        ArrayList list = new ArrayList();


                        for (SxfStruct sxfStruct : sxfArrayBlock.elements()) {
                            Object element = readObject(typeOfElement, (SxfDataBlock) sxfStruct.get(0));
                            list.add(element);
                        }
                    }
                }
            }
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }





    protected static Tuple<String, ISxfBlock> getBlock(SxfParser.ObjectContext object) {
        if (object.children.get(0) instanceof SxfParser.Data_objectContext) {
            return getDataObject((SxfParser.Data_objectContext) object.children.get(0));
        } else if (object.children.get(0) instanceof SxfParser.Array_objectContext) {
            return getArrayBlock((SxfParser.Array_objectContext) object.children.get(0));
        }

        return null;
    }

    protected static Tuple<String, ISxfBlock> getDataObject(SxfParser.Data_objectContext dataObjectContext) {
        String identifier = clearText(dataObjectContext.identifier().getText());

        SxfParser.Data_blockContext dataBlockContext = dataObjectContext.data_block();

        return new Tuple<>(identifier, getDataBlock(dataBlockContext));
    }

    protected static ISxfBlock getDataBlock(SxfParser.Data_blockContext dataBlockContext) {
        SxfDataBlock dataBlock = new SxfDataBlock();
        for (SxfParser.Data_block_elementContext element : dataBlockContext.data_block_elemenets().data_block_element()) {
            if (element.children.get(0) instanceof SxfParser.VariableContext) {
                SxfParser.VariableContext variable = (SxfParser.VariableContext) element.children.get(0);
                String varName = clearText(variable.identifier().getText());
                SxfParser.Data_typesContext dataTypes = (SxfParser.Data_typesContext)variable.data_types();
                Object value = varValue(dataTypes.children.get(0));
                dataBlock.putVar(varName, value);

            } else if (element.children.get(0) instanceof SxfParser.ObjectContext) {
                SxfParser.ObjectContext objectContext = (SxfParser.ObjectContext) element.children.get(0);
                Tuple<String, ISxfBlock> block = getBlock(objectContext);
                dataBlock.putBlock(block.getFirst(), block.getSecond());
            }
        }
        return dataBlock;
    }


    protected static Tuple<String, ISxfBlock> getArrayBlock(SxfParser.Array_objectContext arrayContext) {
        SxfArrayBlock arrayBlock = new SxfArrayBlock();
        String identifier = clearText(arrayContext.identifier().getText());

       SxfParser.Array_blockContext arrayBlockContext = arrayContext.array_block();
        for (SxfParser.Struct_elementContext element : arrayBlockContext.struct_elements().struct_element()) {
            final SxfStruct struct = new SxfStruct();
            for (SxfParser.Data_typesContext data_type : element.data_types()) {
                Object value = varValue(data_type.children.get(0));
                struct.put(value);
            }
            arrayBlock.add(struct);
        }

        return new Tuple<>(identifier, arrayBlock);
    }




    protected static Object varValue(ParseTree rawValue)
    {
        if (rawValue instanceof SxfParser.S_stringContext)
        {
            return clearText(((SxfParser.S_stringContext) rawValue).getText());
        }
        if (rawValue instanceof SxfParser.State_trueContext)
        {
            return true;
        }
        if(rawValue instanceof SxfParser.State_falseContext)
        {
            return false;
        }
        if (rawValue instanceof SxfParser.S_integerContext)
        {
            return Integer.parseInt(rawValue.getText());
        }
        if (rawValue instanceof SxfParser.S_doubleContext)
        {
            return Double.parseDouble(removeNumberSuffix(rawValue.getText()));
        }
        if (rawValue instanceof SxfParser.S_shortContext)
        {
            return Short.parseShort(removeNumberSuffix(rawValue.getText()));
        }
        if (rawValue instanceof SxfParser.State_nullContext) {
            return null;
        }
        if (rawValue instanceof SxfParser.S_floatContext)
        {
            return Float.parseFloat(removeNumberSuffix(rawValue.getText()));
        }
        if (rawValue instanceof SxfParser.Struct_elementContext) {
            final SxfStruct struct = new SxfStruct();
            for (SxfParser.Data_typesContext data_type : ((SxfParser.Struct_elementContext)rawValue).data_types()) {
                Object value = varValue(data_type.children.get(0));
                struct.put(value);
            }
            return struct;
        }

        if (rawValue instanceof SxfParser.Data_blockContext) {
            return getDataBlock((SxfParser.Data_blockContext)rawValue);
        }

        return null;
    }

    private static String removeNumberSuffix(String text)
    {
        if (!Character.isDigit(text.charAt(text.length() - 1)))
        {
            text = text.substring(0, text.length() - 1);
        }

        return text;
    }

    private static boolean isPrimitiveType(Class<?> object) {
        return type.is_class_type_or(object, Boolean.class, Integer.class, Float.class, Double.class, String.class, Short.class, Character.class, Long.class);
    }

    private static String clearText(String text)
    {
        if (text.startsWith("\""))
        {
            text = text.substring(1, text.length() - 1);
        }

        return text;
    }
}
