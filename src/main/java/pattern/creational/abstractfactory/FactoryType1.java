package pattern.creational.abstractfactory;

public class FactoryType1 implements AbstractFactory {
    @Override
    public ClassA createClassA() {
        return new ClassAConcreteType1();
    }

    @Override
    public ClassB createClassB() {
        return new ClassBConcreteType1();
    }
}
