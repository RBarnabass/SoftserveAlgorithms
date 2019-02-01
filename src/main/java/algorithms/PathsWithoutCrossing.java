package algorithms;


import strategy.IAlgorithmStrategy;

import java.util.Scanner;

/**
 * Counting number of possible paths through 2 points without crossings using dynamic programming.
 *
 * @author Oleh Volchkov
 */
public class PathsWithoutCrossing implements IAlgorithmStrategy {

    /**
     * Runner method for execution of algorithm.
     *
     * @param sc scanner provided for user input
     */
    public void execute(Scanner sc) {

        System.out.println("Enter number of points on circle: ");

        int numberOfPoints = sc.nextInt();
        int paths = countPaths(numberOfPoints);

        StringBuilder result = new StringBuilder()
                .append("There is ").append(paths)
                .append(" number of possible paths through two points without crossings.");

        System.out.println(result);
    }

    /**
     * Returns number of possible paths through two points without crossings.
     *
     * @param numberOfPoints number of points on circle; must be even, otherwise method will return 0
     * @return number of possible paths without crossings
     */
    public static int countPaths(int numberOfPoints) {

        if (numberOfPoints % 2 != 0) {

            return 0;
        }

        return catalanNumber(numberOfPoints / 2);
    }

    /**
     * Returns n-th Catalan number.
     *
     * @param n sequence number of Catalan number we need to calculate
     * @return n-th Catalan number
     */
    public static int catalanNumber(int n) {

        int[] catalan = new int[n + 1];

        catalan[0] = 1;
        catalan[1] = 1;

        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }

        return catalan[n];
    }
}