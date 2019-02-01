package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.Scanner;

/**
 * Counting possible ways of covering given distance in 3 steps using dynamic programming.
 *
 * @author Oleh Volchkov
 */
public class WaysToCoverDistance implements IAlgorithmStrategy {

    /**
     * Runner method for execution of algorithm.
     *
     * @param sc scanner provided for user input
     */
    public void execute(Scanner sc) {

        System.out.println("Enter distance to cover: ");

        int distance = sc.nextInt();
        int ways = calculateWays(distance);

        StringBuilder result = new StringBuilder()
                .append("There is ").append(ways)
                .append(" number of ways for covering given distance.");

        System.out.println(result);
    }

    /**
     * Returns number of ways for covering given distance.
     *
     * @param distance distance to cover
     * @return number of possible ways to cover the distance
     */
    public static int calculateWays(int distance) {

        if (distance < 0) {
            return 0;
        }

        if (distance == 0) {
            return 1;
        }

        return calculateWays(distance - 1) +
                calculateWays(distance - 2) +
                calculateWays(distance - 3);
    }
}