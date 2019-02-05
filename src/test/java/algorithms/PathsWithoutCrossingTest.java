package algorithms;

import static org.junit.jupiter.api.Assertions.*;

class PathsWithoutCrossingTest {

    private PathsWithoutCrossing pathsWithoutCrossing;

    void before() {
        this.pathsWithoutCrossing = new PathsWithoutCrossing();
    }

    void after() {
        this.pathsWithoutCrossing = null;
    }

    @org.junit.jupiter.api.Test
    void countPathsTest() {
        before();

        int testOddInput = 1;
        int expectedOddOutput = 0;

        int testEvenInput = 4;
        int expectedEvenOutput = 2;

        assertEquals(expectedOddOutput, this.pathsWithoutCrossing.countPaths(testOddInput));
        assertEquals(expectedEvenOutput, this.pathsWithoutCrossing.countPaths(testEvenInput));

        after();
    }

    @org.junit.jupiter.api.Test
    void catalanNumberTest() {
        before();

        int testInput = 9;
        int testOutput = 4862;

        assertEquals(testOutput, this.pathsWithoutCrossing.catalanNumber(testInput));

        after();
    }
}
