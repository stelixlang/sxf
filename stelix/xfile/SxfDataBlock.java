package stelix.xfile;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SxfDataBlock implements ISxfBlock {

    private LinkedHashMap<String, ISxfBlock> blocks = new LinkedHashMap<>();
    private LinkedHashMap<String, Object> variables = new LinkedHashMap<>();


    public <X> X block(String name) {
        return (X) blocks.getOrDefault(name, null);
    }

    public <X> X variable(String name) {
        return (X) variables.getOrDefault(name, null);
    }

    public boolean blockExists(String name) {
        return blocks.containsKey(name);
    }

    public boolean varExists(String name) {
        return variables.containsKey(name);
    }

    public LinkedHashMap<String, Object> variables() {
        return variables;
    }

    public LinkedHashMap<String, ISxfBlock> blocks() {
        return blocks;
    }

    public void putBlock(String identifier, ISxfBlock block) {
        blocks.put(identifier, block);
    }

    public void putVar(String identifier, Object value) {
        variables.put(identifier, value);
    }


    public SxfArrayBlock arrayBlock(String identifier) {
        return block(identifier);
    }

    public SxfDataBlock dataBlock(String identifier) {
        return block(identifier);
    }

}
