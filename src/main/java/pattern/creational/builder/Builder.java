package pattern.creational.builder;

public interface Builder {
    Builder reset();
    Builder buildStep1();
    Builder buildStep2();
    Builder buildStepN();
}
