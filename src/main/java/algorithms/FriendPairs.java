package algorithms;

import strategy.IAlgorithmStrategy;
import utilities.UserInputValidator;

/**
 * Counting number of possible ways to pair for given amount of friends using dynamic programming.
 *
 * @author Oleh Volchkov
 */
public class FriendPairs implements IAlgorithmStrategy {

    /**
     * Returns count of possible ways to pair/stay alone for given amount of friends.
     *
     * @param numberOfFriends amount of friends to cover
     * @return count of possible ways to pair
     */
    int countWaysToPair(int numberOfFriends) {

        int[] cachedWays = new int[numberOfFriends + 1];

        for (int i = 0; i <= numberOfFriends; i++) {

            if (i <= 2) {
                cachedWays[i] = i;
            } else {
                cachedWays[i] = cachedWays[i - 1] + (i - 1) * cachedWays[i - 2];
            }
        }

        return cachedWays[numberOfFriends];
    }

    @Override
    public void execute() {

        System.out.println("Enter amount of friends: ");

        int minimalFriendsCount = 1;
        String incorrectInputMessage = "Incorrect input. Please, provide integer value that bigger than -1";
        int friendsCount = UserInputValidator.getUserInput(minimalFriendsCount, Integer.MAX_VALUE,
                incorrectInputMessage);
        int ways = countWaysToPair(friendsCount);

        StringBuilder result = new StringBuilder()
                .append("There is ").append(ways)
                .append(" number of ways to pair for given amount of friends.");

        System.out.println(result);
    }
}

