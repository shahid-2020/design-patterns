package observerPattern.custom;

public interface Observer {
    public void update(String message);

    public void registerSubject(Subject sub);
    public void unregisterSubject();
}
