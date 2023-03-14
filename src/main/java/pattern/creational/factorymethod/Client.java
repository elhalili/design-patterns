package pattern.creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        creator.doSomeBusiness();
        // or getting new objects
        Product product = creator.createProduct();
        // for creating new type of products
        creator = new ConcreteCreatorB();
        Product newProductType = creator.createProduct();
    }
}
