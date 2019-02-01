package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.InputMismatchException;
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
     */
    public void execute() {

        System.out.println("Enter distance to cover: ");

        int distance = getUserInput();

        int ways = calculateWays(distance);

        StringBuilder result = new StringBuilder()
                .append("There is ").append(ways)
                .append(" number of ways for covering given distance.");

        System.out.println(result);
    }

    /**
     * Get correct input from user.
     *
     * @return distance from user input
     */
    private int getUserInput() {

        Scanner sc = new Scanner(System.in);

        int distance = -1;

        try {
            distance = sc.nextInt();

            if(distance < 1) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {

            System.out.println("Incorrect input. Please, provide integer value that bigger than 0");
            getUserInput();
        }

        return distance;
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