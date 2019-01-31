package strategy;

import java.util.Scanner;

public class AlgorithmRunner {

    private AlgorithmStrategy strategy;

    public void changeStrategy(AlgorithmStrategy strategy) {
        this.strategy = strategy;
    }

    public void run(Scanner sc) {
        strategy.execute(sc);
    }
}