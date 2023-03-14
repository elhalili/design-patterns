package pattern.creational.factorymethod;

public class ConcreteCreatorB extends Creator {
    public Product createProduct() {
        // create the object as you want: using new or reusing exists objects...
        return new ProductB();
    }
}
