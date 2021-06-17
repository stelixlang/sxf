package stelix.xfile;

import java.util.Collection;
import java.util.HashMap;

public class SxfDataBlock implements ISxfBlock {

    private HashMap<String, ISxfBlock> blocks = new HashMap<>();
    private HashMap<String, Object> variables = new HashMap<>();


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

    public HashMap<String, Object> variables() {
        return variables;
    }

    public HashMap<String, ISxfBlock> blocks() {
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
