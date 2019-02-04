package algorithms;

import algorithms.FriendPairs;

import static org.junit.jupiter.api.Assertions.*;

public class FriendPairsTest {

    private FriendPairs friendPairs;

    void before() {
        this.friendPairs = new FriendPairs();
    }

    @org.junit.jupiter.api.Test
    void countWaysToPairTest() {

        int testInputA = 3;
        int expectedOutputA = 4;

        int testInputB = 2;
        int expectedOutputB = 2;

        int testInputC = 1;
        int expectedOutputC = 1;

        assertEquals(expectedOutputA, this.friendPairs.countWaysToPair(testInputA));
        assertEquals(expectedOutputB, this.friendPairs.countWaysToPair(testInputB));
        assertEquals(expectedOutputC, this.friendPairs.countWaysToPair(testInputC));
    }
}
