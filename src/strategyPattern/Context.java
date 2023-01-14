package strategyPattern;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public float executeStrategy(float a, float b){
        return strategy.calc(a, b);
    }
}
