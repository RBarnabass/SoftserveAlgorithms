package algorithms;

import strategy.AlgorithmStrategy;

import java.util.Scanner;

public class FriendPairs implements AlgorithmStrategy {

    public void execute(Scanner sc) {

        System.out.println("Enter amount of friends: ");

        int friends = sc.nextInt();
        int ways = countWaysToPair(friends);

        StringBuilder result = new StringBuilder()
                .append("There is ").append(ways)
                .append(" number of ways to pair for given amount of friends.");

        System.out.println(result);
    }

    /**
     * Returns count of possible ways to pair/stay alone for given amount of friends.
     *
     * @param numberOfFriends amount of friends to cover
     * @return count of possible ways to pair
     * @author Oleh Volchkov
     */
    public static int countWaysToPair(int numberOfFriends) {

        int cachedWays[] = new int[numberOfFriends + 1];

        for (int i = 0; i <= numberOfFriends; i++) {

            if (i <= 2) {
                cachedWays[i] = i;
            } else {
                cachedWays[i] = cachedWays[i - 1] + (i - 1) * cachedWays[i - 2];
            }
        }

        return cachedWays[numberOfFriends];
    }
}

