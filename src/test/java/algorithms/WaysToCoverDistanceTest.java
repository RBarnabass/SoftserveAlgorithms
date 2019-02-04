package algorithms;

import static org.junit.jupiter.api.Assertions.*;

class WaysToCoverDistanceTest {

    @org.junit.jupiter.api.Test
    void calculateWaysTest() {

        int testInputA = 3;
        int testOutputA = 4;

        int testInputB = 4;
        int testOutputB = 7;

        int testInputC = 6;
        int testOutputC = 24;

        assertEquals(testOutputA, WaysToCoverDistance.calculateWays(testInputA));
        assertEquals(testOutputB, WaysToCoverDistance.calculateWays(testInputB));
        assertEquals(testOutputC, WaysToCoverDistance.calculateWays(testInputC));
    }
}
