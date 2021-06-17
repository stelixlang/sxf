package stelix.xfile.writer;

import stelix.xfile.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;

public class SxfWriter {

    private WriteType writeType;
    private ElementWriteType elementWriteType;

    public SxfWriter() {
        this.writeType = WriteType.MULTI_LINE;
        this.elementWriteType = ElementWriteType.INLINE;
    }

    public void write(SxfFile objFile, File file) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8))) {
            writer.write(write(objFile));
            writer.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String write(SxfFile file) {
        StringBuilder stringBuilder = new StringBuilder();

        int currentBlockIndex = 0;
        int maxBlockIndex = file.blocks().entrySet().size();
        for (Map.Entry<String, ISxfBlock> block : file.blocks().entrySet()) {
            stringBuilder.append(fixName(block.getKey())).append(" => ");
            stringBuilder.append(writeBlock(block.getValue(), 0));

            if (++currentBlockIndex < maxBlockIndex) {
                if (writeType == WriteType.INLINE) {
                    stringBuilder.append(", ");
                } else {
                    stringBuilder.append(",").append(System.lineSeparator());

                }
            }
        }
        return stringBuilder.toString();
    }

    public String writeBlock(ISxfBlock block, int tabCount) {
        if (block instanceof SxfDataBlock) {
            return writeDataBlock((SxfDataBlock)block, tabCount);
        } else if (block instanceof SxfArrayBlock) {
            return writeArrayBlock((SxfArrayBlock)block, tabCount);
        }
        return "";
    }

    private String writeArrayBlock(SxfArrayBlock arrayBlock, int tabCount) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tabCount % 2 == 0 ? "{" : "(");
        if (writeType == WriteType.MULTI_LINE) {
            stringBuilder.append(System.lineSeparator());
        } else {
            stringBuilder.append(" ");
        }

        int currentElementIndex = 0;
        int maxElementIndex = arrayBlock.elements().size();
        for (SxfStruct element : arrayBlock.elements()) {
            if (writeType == WriteType.MULTI_LINE) {
                putTab(stringBuilder, tabCount + 1);
            }
            stringBuilder.append(writeStruct(element, tabCount));

            if (++currentElementIndex < maxElementIndex) {
                stringBuilder.append(",");
                if (writeType == WriteType.MULTI_LINE) {
                    stringBuilder.append(System.lineSeparator());
                } else {
                    stringBuilder.append(" ");
                }
            }
        }

        if (writeType == WriteType.MULTI_LINE) {
            stringBuilder.append(System.lineSeparator());
            putTab(stringBuilder, tabCount);
        } else {
            stringBuilder.append(" ");
        }
        stringBuilder.append(tabCount % 2 == 0 ? "}" : ")");
        return stringBuilder.toString();
    }

    private String writeStruct(SxfStruct struct, int tabCount) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        if (elementWriteType == ElementWriteType.MULTI_LINE) {
            stringBuilder.append(System.lineSeparator());
            putTab(stringBuilder,tabCount + 1);
        }
        final WriteType oldWriteType = writeType;
        writeType = WriteType.INLINE;

        int currentElementIndex = 0;
        int maxElementIndex = struct.elements().size();

        for (Object element : struct.elements()) {
            if (element instanceof ISxfBlock) {
                stringBuilder.append(writeBlock((ISxfBlock) element, tabCount + 1));
            } else if (element instanceof SxfStruct) {
                stringBuilder.append(writeStruct((SxfStruct)element, tabCount + 1));
            } else {
                writeVar(element, stringBuilder);
            }

            if (++currentElementIndex < maxElementIndex) {
                stringBuilder.append(",");
                if (elementWriteType == ElementWriteType.INLINE) {
                    stringBuilder.append(" ");
                } else {
                    stringBuilder.append(System.lineSeparator());
                    putTab(stringBuilder,tabCount + 1);
                }
            }
        }


        writeType = oldWriteType;
        if (elementWriteType == ElementWriteType.MULTI_LINE) {
            stringBuilder.append(System.lineSeparator());
            putTab(stringBuilder, tabCount);
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    private String writeDataBlock(SxfDataBlock dataBlock, int tabCount) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tabCount % 2 == 0 ? "{" : "(");
        if (writeType == WriteType.MULTI_LINE) {
            stringBuilder.append(System.lineSeparator());
        } else {
            stringBuilder.append(" ");
        }

        int maxVarIndex = dataBlock.variables().size();
        int currentVarIndex = 0;
        for (Map.Entry<String, Object> variable : dataBlock.variables().entrySet()) {
            if (writeType == WriteType.MULTI_LINE) {
                putTab(stringBuilder, tabCount + 1);
            }
            stringBuilder.append(fixName(variable.getKey())).append(": ");


            if (variable.getValue() instanceof SxfStruct) {
                stringBuilder.append(writeStruct((SxfStruct)variable.getValue(), tabCount + 1));
            } else {
                writeVar(variable.getValue(), stringBuilder);
            }

            if (++currentVarIndex < maxVarIndex) {
                stringBuilder.append(",");
                if (writeType == WriteType.MULTI_LINE) {
                    stringBuilder.append(System.lineSeparator());
                } else {
                    stringBuilder.append(" ");
                }
            }
        }

        int maxBlockIndex = dataBlock.blocks().size();
        int currentBlockIndex = 0;
        if (maxBlockIndex != 0 && maxVarIndex != 0) {
            if (writeType == WriteType.INLINE) {
                stringBuilder.append(", ");
            } else {
                stringBuilder.append(",").append(System.lineSeparator());
            }
        }

        for (Map.Entry<String, ISxfBlock> block : dataBlock.blocks().entrySet()) {
            if (writeType == WriteType.MULTI_LINE) {
                putTab(stringBuilder, tabCount + 1);
            }
            if (block instanceof SxfArrayBlock) {
                stringBuilder.append("[]");
            }
            stringBuilder.append(fixName(block.getKey())).append(" => ");
            stringBuilder.append(writeBlock(block.getValue(), tabCount + 1));
        }
        if (writeType == WriteType.MULTI_LINE) {
            stringBuilder.append(System.lineSeparator());
            putTab(stringBuilder, tabCount);
        } else {
            stringBuilder.append(" ");
        }
        stringBuilder.append(tabCount % 2 == 0 ? "}" : ")");

        return stringBuilder.toString();
    }

    // add struct
    private void writeVar(Object value, StringBuilder sb) {
        try {
            if (value == null) {
                sb.append("?");
            }
            else if (value instanceof String) {
                sb.append("\"").append(value).append("\"");
            } else if (value instanceof Integer) {
                sb.append(value.toString());
            } else if (value instanceof Short) {
                sb.append(value).append("s");
            } else if (value instanceof Float) {
                sb.append(value).append("f");
            } else if (value instanceof Double) {
                sb.append(value).append("d");
            } else if (value instanceof Boolean) {
                sb.append(value.toString().toLowerCase());
            }
        } catch (Exception ex) {}
    }


    private static void putTab(StringBuilder builder, int times) {
        for (int i = times; i > 0; i--) {
            builder.append("\t");
        }
    }

    private static String removeNumberSuffix(String text)
    {
        if (!Character.isDigit(text.charAt(text.length() - 1)))
        {
            text = text.substring(0, text.length() - 1);
        }

        return text;
    }

    private static String fixName(String name) {
        if (name.contains(" ")) {
            return '"' + name + '"';
        }
        return name;
    }

    private static String clearText(String text)
    {
        if (text.startsWith("\""))
        {
            text = text.substring(1, text.length() - 1);
        }

        return text;
    }

    public void setElementWriteType(ElementWriteType elementWriteType) {
        this.elementWriteType = elementWriteType;
    }

    public void setWriteType(WriteType writeType) {
        this.writeType = writeType;
    }

    public enum WriteType {
        INLINE,
        SEMI_INLINE,
        MULTI_LINE
    }

    public enum ElementWriteType {
        INLINE,
        MULTI_LINE,
    }
}
