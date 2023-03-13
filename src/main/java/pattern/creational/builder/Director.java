package pattern.creational.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public Director changeBuilder(Builder builder) {
        this.builder = builder;

        return this;
    }
    public void makeTypeA() {
        builder.reset()
        .buildStep1()
        .buildStepN();
    }
    public void makeTypeZ() {
        builder.reset()
        .buildStep1()
        .buildStep2();
    }
}
