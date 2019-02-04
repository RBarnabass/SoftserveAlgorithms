package strategy;

/**
 * Algorithm execution sequence.
 *
 * @author Oleh Volchkov
 */
public class AlgorithmRunner {

    /**
     * Instance of algorithm.
     */
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