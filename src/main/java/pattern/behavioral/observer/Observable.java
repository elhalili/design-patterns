package pattern.behavioral.observer;

import java.util.List;
import java.util.Vector;

public class Observable {
    private List<Observer> observers;

    public Observable() {
        observers = new Vector<Observer>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(Object arg) {
        for (Observer observer: observers)
            observer.update(this, arg);

    }
}
