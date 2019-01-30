import Algorithms.FriendPairs;

import static org.junit.jupiter.api.Assertions.*;

public class FriendPairsTest {

    @org.junit.jupiter.api.Test
    void countWaysToPairTest() {

        int testInput = 3;
        int expectedOutput = 4;

        assertEquals(expectedOutput, FriendPairs.countWaysToPair(testInput));
    }
}
