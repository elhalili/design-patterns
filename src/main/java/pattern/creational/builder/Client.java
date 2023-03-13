package pattern.creational.builder;

public class Client {
    public static void main(String[] args) {
        ObjectToBeBuiltBuilder toBeBuiltBuilder = new ObjectToBeBuiltBuilder();
        Director director = new Director(toBeBuiltBuilder);
        director.makeTypeA();

        ObjectToBeBuilt toBeBuilt = toBeBuiltBuilder.getResult();
    }
}
