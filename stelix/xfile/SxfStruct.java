package stelix.xfile;

import java.util.ArrayList;
import java.util.List;

public class SxfStruct {

    private List<Object> elements;

    public SxfStruct() {
        elements = new ArrayList<>();
    }

    public void put(Object object) {
        elements.add(object);
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public List<Object> elements() {
        return elements;
    }

    public <X> X get(int index) {
        return (X) elements.get(index);
    }

}
