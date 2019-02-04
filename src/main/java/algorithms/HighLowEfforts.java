package algorithms;

import strategy.IAlgorithmStrategy;

import static utilities.Util.enterPositiveNumber;
import static utilities.Util.userInputArray;

/**
 * Class that returns maximum amount of cost you can perform
 *
 * @author Nazar Mavko
 */
public class HighLowEfforts implements IAlgorithmStrategy {

    /**
     * Returns the member of position in Fibonacci sequence
     *
     * @param numberOfDays The number of days which is integer
     * @param low          the cost of low effort work
     * @param high         the cost of high effort work
     * @return maximum amount of cost you can perform
     */
    public static int findMaximumAmount(int[] high, int[] low, int numberOfDays) {
        if (numberOfDays <= 0)
            return 0;
        return Math.max(high[numberOfDays - 1] + findMaximumAmount(high, low, (numberOfDays - 2)), low[numberOfDays - 1] + findMaximumAmount(high, low, (numberOfDays - 1)));
    }

    /**
     * Runner method for execution of algorithm.
     */
    public void execute() {
        System.out.println("Please enter number of days");
        int numberOfDays = enterPositiveNumber();

        System.out.println("Enter high array");
        int[] high = userInputArray();

        System.out.println("Enter low array");
        int[] low = userInputArray();

        System.out.println(findMaximumAmount(high, low, numberOfDays));
    }
}
