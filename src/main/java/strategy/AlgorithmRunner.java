package strategy;

/**
 * Algorithm execution sequence.
 */
public class AlgorithmRunner {

    private IAlgorithmStrategy algorithm;

    /**
     * Changes algorithm to execute.
     *
     * @param algorithm algorithm to execute
     */
    public void changeStrategy(IAlgorithmStrategy algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Executes algorithm.
     */
    public void run() {
        algorithm.execute();
    }
}