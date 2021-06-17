package stelix.xfile;

import stelix.xfile.ISxfBlock;
import stelix.xfile.SxfArrayBlock;
import stelix.xfile.SxfDataBlock;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class SxfFile {

    private HashMap<String, ISxfBlock> blocks = new HashMap<>();

    public <X> X get(String name) {
        return (X) blocks.getOrDefault(name, null);
    }

    public HashMap<String, ISxfBlock> blocks() {
        return blocks;
    }


    public <X> X block(String identifier) {
        return (X) blocks.getOrDefault(identifier, null);
    }

    public SxfArrayBlock arrayBlock(String identifier) {
        return block(identifier);
    }

    public SxfDataBlock dataBlock(String identifier) {
        return block(identifier);
    }

    public void put(String identifier, ISxfBlock block) {
        blocks.put(identifier, block);
    }

}
