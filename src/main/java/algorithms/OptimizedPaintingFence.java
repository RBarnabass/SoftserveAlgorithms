package algorithms;

import strategy.IAlgorithmStrategy;
import utilities.UserInputValidator;

import java.util.Scanner;


/**
 * Optimized painting fence algorithm with one variable instead of a table.
 *
 * @author Andrii Senchakevych
 */
public class OptimizedPaintingFence implements IAlgorithmStrategy {

    private UserInputValidator userInput;

    public OptimizedPaintingFence(Scanner sc) {

        userInput = new UserInputValidator(sc);
    }

    /**
     * Returns number of ways of painting the fence such that at most 2 adjacent posts have the same color.
     *
     * @param n n numbers of posts
     * @param k n numbers of colors
     * @return number of ways of painting the fence
     */
    public long optimizedPaintingFence(int n, int k) {

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

    @Override
    public void execute() {

        String errorMessage = "Number must be positive integer and less than 101";
        int lowerBound = 0;
        int upperBound = 100;
        int n;
        System.out.println("Enter numbers of posts");
        n = userInput.getUserInput(lowerBound, upperBound, errorMessage);
        System.out.println("Enter numbers of colors");
        int k;
        upperBound = 10;
        errorMessage = "Number must be positive integer and less than 11";
        k = userInput.getUserInput(lowerBound, upperBound, errorMessage);
        System.out.println("Number of ways is " + optimizedPaintingFence(n, k));

    }
}
