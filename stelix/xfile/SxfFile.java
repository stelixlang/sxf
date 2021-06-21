package stelix.xfile;

import stelix.xfile.ISxfBlock;
import stelix.xfile.SxfArrayBlock;
import stelix.xfile.SxfDataBlock;

import java.util.*;

public class SxfFile {

    private LinkedHashMap<String, ISxfBlock> blocks = new LinkedHashMap<>();

    public <X> X get(String name) {
        return (X) blocks.getOrDefault(name, null);
    }

    public LinkedHashMap<String, ISxfBlock> blocks() {
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
