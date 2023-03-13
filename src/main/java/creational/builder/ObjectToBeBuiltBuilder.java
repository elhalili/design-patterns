package creational.builder;

public class ObjectToBeBuiltBuilder implements Builder {
    private ObjectToBeBuilt toBeBuilt;
    public Builder reset() {
        this.toBeBuilt = new ObjectToBeBuilt();
        return this;
    }

    public Builder buildStep1() {
        // build step 1
        return this;
    }

    public Builder buildStep2() {
        // build step 2
        return this;
    }

    public Builder buildStepN() {
        // build step N
        return this;
    }

    public ObjectToBeBuilt getResult() {
        return toBeBuilt;
    }
}
