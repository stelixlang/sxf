package stelix.xfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SxfArrayBlock implements ISxfBlock
{
    //todo: ? private String[] holderNames;

    private List<SxfStruct> elements = new ArrayList<>();

    public SxfStruct get(int index) {
        return elements.get(index);
    }

    public void add(SxfStruct element) {
        elements.add(element);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public List<SxfStruct> elements() {
        return elements;
    }

    public boolean exists(int index) {
        return elements.size() < index;
    }

}
