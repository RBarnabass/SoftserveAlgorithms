package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Counting number of possible ways to pair for given amount of friends using dynamic programming.
 *
 * @author Oleh Volchkov
 */
public class FriendPairs implements IAlgorithmStrategy {

    /**
     * Runner method for execution of algorithm.
     *
     */
    public void execute() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount of friends: ");

        int friendsCount = getUserInput();
        int ways = countWaysToPair(friendsCount);

        StringBuilder result = new StringBuilder()
                .append("There is ").append(ways)
                .append(" number of ways to pair for given amount of friends.");

        System.out.println(result);
    }

    /**
     * Get correct input from user.
     *
     * @return friends from user input
     */
    private int getUserInput() {

        Scanner sc = new Scanner(System.in);

        int friendsCount;

        try {
            friendsCount = sc.nextInt();

            if(friendsCount < 0) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {

            System.out.println("Incorrect input. Please, provide positive integer value:");
            friendsCount = getUserInput();
        }

        return friendsCount;
    }

    /**
     * Returns count of possible ways to pair/stay alone for given amount of friends.
     *
     * @param numberOfFriends amount of friends to cover
     * @return count of possible ways to pair
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

