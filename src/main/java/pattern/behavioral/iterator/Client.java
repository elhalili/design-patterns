package pattern.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        Object obj1 = "obj 1";
        Object obj2 = "obj 2";
        Object obj3 = "obj 3";

        ConcreteCollection collection = new ConcreteCollection();
        collection.add(obj1);
        collection.add(obj2);
        collection.add(obj3);

        // the same way as for each works
        Iterator<Object> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}
