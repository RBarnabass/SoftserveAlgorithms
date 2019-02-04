package algorithms;

import static utilities.UserInputValidator.getUserInput;

import strategy.IAlgorithmStrategy;

/**
 * The CountWaysOfSum class that implements algorithm of finding how many ways
 * is possible to calculate n with positive integers.
 *
 * @author Iryna Shturyn
 * @version 1.0
 */
public class CountWaysOfSum implements IAlgorithmStrategy {
    /**
     * Returns how many ways is possible to calculate n with positive integers.
     *
     * @param n positive integer
     * @return count of ways
     */
    int countWays(int n) {
        int[] ways = new int[n + 1];
        ways[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                ways[j] += ways[j - i];
            }
        }
        return ways[n];
    }

    /**
     * Asks user to enter positive integer and prints result
     */
    public void execute() {

        String incorrectInputMessage = "Incorrect input. Please, provide integer value that bigger than 0";
        int n = getUserInput(0, Integer.MAX_VALUE, incorrectInputMessage);
        
        int result = countWays(n);
        if (n == 1) {
            System.out.println("There no possible way to calculate " + n + " with positive integers.");
        } else if (n == 2) {
            System.out.println("There is " + result + " possible way to calculate " + n + " with positive integers.");
        } else {
            System.out.println("There are " + result + " possible ways to calculate " + n + " with positive integers.");
        }
    }
}
