import Algorithms.PathsWithoutCrossing;

import static org.junit.jupiter.api.Assertions.*;

class PathsWithoutCrossingTest {

    @org.junit.jupiter.api.Test
    void countPathsTest() {

        int testOddInput = 1;
        int expectedOddOutput = 0;

        int testEvenInput = 4;
        int expectedEvenOutput = 2;

        assertEquals(expectedOddOutput, PathsWithoutCrossing.countPaths(testOddInput));
        assertEquals(expectedEvenOutput, PathsWithoutCrossing.countPaths(testEvenInput));
    }

    @org.junit.jupiter.api.Test
    void catalanNumberTest() {

        int testInput = 9;
        int testOutput = 4862;

        assertEquals(testOutput, PathsWithoutCrossing.catalanNumber(testInput));
    }
}
