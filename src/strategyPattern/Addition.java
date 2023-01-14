package strategyPattern;

public class Addition implements Strategy {
    @Override
    public float calc(float a, float b) {
        return a + b;
    }
}
