package Algorithms;

public class HighLowEfforts {

    /**
     * Returns the member of position in Fibonacci sequence
     *
     * @param numberOfDays The number of days which is integer
     * @param low          the cost of low effort work
     * @param high         the cost of high effort work
     * @return maximum amount of cost you can perform
     * @author Nazar Mavko
     */
    public static int findMaximumAmount(int[] high, int[] low, int numberOfDays) {
        if (numberOfDays <= 0)
            return 0;
        return Math.max(high[numberOfDays - 1] + findMaximumAmount(high, low, (numberOfDays - 2)), low[numberOfDays - 1] + findMaximumAmount(high, low, (numberOfDays - 1)));
    }


}
