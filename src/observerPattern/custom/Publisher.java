package observerPattern.custom;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public Publisher() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) observers.add(obj);
        }

    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        synchronized (MUTEX) {
            if (!changed) return;
            observersLocal = new ArrayList<>(observers);
            changed = false;
        }

        for (Observer obj : observersLocal) {
            obj.update(message);
        }
    }


    public void publish(String msg) {
        System.out.println("Message Published: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
