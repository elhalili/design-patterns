package pattern.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.addObserver(new ConcreteObserver1());
        publisher.addObserver(new ConcreteObserver2());
        publisher.addObserver(new Observer() {
            public void update(Observable observable, Object arg) {
                // do some stuff for observer n
            }
        });

        // ....
        publisher.mainBusinessLogic();
    }
}
