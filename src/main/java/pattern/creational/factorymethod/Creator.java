package pattern.creational.factorymethod;

public abstract class Creator {
    public void doSomeBusiness() {
        // some business related to products
        Product product = createProduct();
        product.doStuff();
    }
    public abstract Product createProduct();
}
