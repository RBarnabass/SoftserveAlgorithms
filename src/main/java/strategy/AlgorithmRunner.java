package strategy;

import java.util.Scanner;

public class AlgorithmRunner {

    private IAlgorithmStrategy strategy;

    public void changeStrategy(IAlgorithmStrategy strategy) {
        this.strategy = strategy;
    }

    public void run(Scanner sc) {
        strategy.execute(sc);
    }
}