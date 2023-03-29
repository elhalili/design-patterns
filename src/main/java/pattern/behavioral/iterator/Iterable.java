package pattern.behavioral.iterator;

public interface Iterable<T> {
    Iterator<T> createIterator();
}
