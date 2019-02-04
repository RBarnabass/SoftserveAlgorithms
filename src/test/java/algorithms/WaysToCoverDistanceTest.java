package algorithms;

import static org.junit.jupiter.api.Assertions.*;

class WaysToCoverDistanceTest {

    private WaysToCoverDistance waysToCoverDistance;

    void before() {
        this.waysToCoverDistance = new WaysToCoverDistance();
    }

    void after() {
        this.waysToCoverDistance = null;
    }

    @org.junit.jupiter.api.Test
    void calculateWaysTest() {

        before();

        int testInputA = 3;
        int testOutputA = 4;

        int testInputB = 4;
        int testOutputB = 7;

        int testInputC = 6;
        int testOutputC = 24;

        assertEquals(testOutputA, this.waysToCoverDistance.calculateWays(testInputA));
        assertEquals(testOutputB, this.waysToCoverDistance.calculateWays(testInputB));
        assertEquals(testOutputC, this.waysToCoverDistance.calculateWays(testInputC));

        after();
    }
}
