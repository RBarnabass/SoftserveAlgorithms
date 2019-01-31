import algorithms.FriendPairs;

import static org.junit.jupiter.api.Assertions.*;

public class FriendPairsTest {

    @org.junit.jupiter.api.Test
    void countWaysToPairTest() {

        int testInputA = 3;
        int expectedOutputA = 4;

        int testInputB = 2;
        int expectedOutputB = 2;

        assertEquals(expectedOutputA, FriendPairs.countWaysToPair(testInputA));
        assertEquals(expectedOutputB, FriendPairs.countWaysToPair(testInputB));
    }
}
