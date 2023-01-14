package observerPattern.custom;

public class Subscriber implements Observer {
    private final String name;
    private Subject sub;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " :: Consuming message :: " + message);

    }

    @Override
    public void registerSubject(Subject sub) {
        this.sub = sub;
    }

    @Override
    public void unregisterSubject() {
        this.sub = null;
    }
}
