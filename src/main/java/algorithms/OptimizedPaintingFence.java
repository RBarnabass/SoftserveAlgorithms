package algorithms;

import strategy.IAlgorithmStrategy;

import static utilities.UserInputValidator.getUserInput;


/**
 * Optimized painting fence algorithm with one variable instead of a table
 *
 * @author Andrii Senchakevych
 */
public class OptimizedPaintingFence implements IAlgorithmStrategy {

    /**
     * Returns number of ways of painting the fence such that at most 2 adjacent posts have the same color
     *
     * @param n n numbers of posts
     * @param k n numbers of colors
     * @return number of ways of painting the fence
     */
    public static long optimizedPaintingFence(int n, int k) {

        long total = k;
        long same = 0;
        long diff = k;

        for (int i = 2; i <= n; i++) {

            same = diff;
            diff = total * (k - 1);
            total = (same + diff);
        }

        return total;
    }

    public void execute() {

        int n;
        int k;

        String errorMessage = "Number must be positive integer and less than 101";
        int lowerBound = 0;
        int upperBound = 100;
        System.out.println("Enter numbers of posts");
        n = getUserInput(lowerBound, upperBound, errorMessage);
        System.out.println("Enter numbers of colors");

        upperBound = 10;
        errorMessage = "Number must be positive integer and less than 11";
        k = getUserInput(lowerBound, upperBound, errorMessage);
        System.out.println("Number of ways is " + optimizedPaintingFence(n, k));

    }
}
