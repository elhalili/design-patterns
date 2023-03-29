package pattern.behavioral.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator<Object> {
    private List<Object> collection;
    private int currentIndex = 0;
    public ConcreteIterator(List<Object> collection) {
        this.collection = collection;
    }
    public boolean hasNext() {
        return currentIndex < collection.size();
    }

    public Object getNext() {
        return collection.get(currentIndex++);
    }
}
