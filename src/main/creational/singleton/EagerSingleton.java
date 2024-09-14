package creational.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance;

    static {
        try {
            instance = new EagerSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}