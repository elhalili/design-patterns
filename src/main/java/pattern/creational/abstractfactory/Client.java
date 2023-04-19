package pattern.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        // Type 1
        AbstractFactory factory = new FactoryType1();
        // creating type1 classes
        ClassA classA = factory.createClassA();
        ClassB classB = factory.createClassB();

        // Type 2
        factory = new FactoryType2();
        // creating type2 classes
        classA = factory.createClassA();
        classB = factory.createClassB();
    }
}
