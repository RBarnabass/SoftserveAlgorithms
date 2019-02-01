package strategy;

public class AlgorithmRunner {

    private IAlgorithmStrategy strategy;

    public void changeStrategy(IAlgorithmStrategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.execute();
    }
}