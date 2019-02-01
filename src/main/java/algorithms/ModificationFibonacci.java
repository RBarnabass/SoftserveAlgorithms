package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.*;

import static utilities.UserInputValidator.getUserInput;

/**
 * Modification Fibonacci sequence
 *
 * @author Andrii Senchakevych
 */
public class ModificationFibonacci implements IAlgorithmStrategy {

    private static int[] mmfib = new int[10000];

    /**
     * Finds which is the member of position n in Modification Fibonacci sequence.
     * Top-Down approach
     *
     * @param n The position - n which is integer
     * @return the member of position n in Modification Fibonacci sequence
     * @author Andrii Senchakevych
     */
    public static int mmodificationFibonacci(int n) {

        int result = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2 || n == 3) {
            return 1;
        } else if (mmfib[n] != 0) {
            return mmfib[n];
        } else {
            result = mmodificationFibonacci(n - 1) + mmodificationFibonacci(n - 3);
            mmfib[n] = result;
            return result;
        }

    }

    /**
     * Finds which is the member of position n in Modification Fibonacci sequence.
     * Bottom-Up approach
     *
     * @param n The position - n which is integer
     * @return the member of position n in Modification Fibonacci sequence
     * @author Andrii Senchakevych
     */
    public static int modificationFibonacci(int n) {

        int[] mfib = new int[n + 4];

        mfib[0] = 0;
        mfib[1] = 1;
        mfib[2] = 1;
        mfib[3] = 1;

        for (int i = 4; i <= n; i++) {
            mfib[i] = mfib[i - 1] + mfib[i - 3];
        }

        return mfib[n];

    }

    public void execute() {

        int n;
        System.out.println("Enter position: ");
        String errorMessage = "That's not a position number of Modification Fibonacci sequence!" +
                "\n" +
                "Or input value is too long, try again!";
        int lowerBound = 1;
        int upperBound = 200;
        n = getUserInput(lowerBound, upperBound, errorMessage);
        System.out.println("Member Modification Fibonacci sequence of position " + n + " is " + modificationFibonacci(n));
    }

}
