package Algorithms;

public class FriendPairs {

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

