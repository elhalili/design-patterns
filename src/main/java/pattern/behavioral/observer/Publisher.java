package pattern.behavioral.observer;

public class Publisher extends Observable {
    private Object mainState;

    public void mainBusinessLogic() {
        // some business logic that change the state
        Object newState = new Object();
        mainState = newState;

        notifyObservers(newState);
    }
}
