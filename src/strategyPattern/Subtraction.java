package strategyPattern;

public class Subtraction implements Strategy {

    @Override
    public float calc(float a, float b) {
        return a - b;
    }
}
