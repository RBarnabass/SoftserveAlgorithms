package strategy;

public class AlgorithmRunner {

    private AlgorithmStrategy strategy;

    public void changeStrategy(AlgorithmStrategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.execute();
    }
}