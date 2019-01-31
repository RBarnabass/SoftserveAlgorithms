package algorithms;

import strategy.AlgorithmStrategy;

import java.util.Scanner;

public class WaysToCoverDistance implements AlgorithmStrategy {

    public void execute() {

        Scanner sc = new Scanner(System.in);

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
     * @author Oleh Volchkov
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