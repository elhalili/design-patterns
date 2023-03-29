package pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements Iterable<Object> {
    List<Object> collection = new ArrayList<Object>();
    public void add(Object obj) {
        collection.add(obj);
    }
    public Iterator<Object> createIterator() {
        return new ConcreteIterator(collection);
    }
}
