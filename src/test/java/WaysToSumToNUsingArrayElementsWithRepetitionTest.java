import algorithms.WaysToSumToNUsingArrayElementsWithRepetition;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaysToSumToNUsingArrayElementsWithRepetitionTest {

    @org.junit.jupiter.api.Test
    void waysToCountTest() {

        int inputArrayA[] = {1, 5, 6};
        int inputNumberA = 7;
        int expectedNumberA = 6;

        int inputArrayB[] = {1, 3, 5};
        int inputNumberB = 6;
        int expectedNumberB = 8;

        assertEquals(expectedNumberA, WaysToSumToNUsingArrayElementsWithRepetition.waysToCount(inputArrayA, inputNumberA));
        assertEquals(expectedNumberB, WaysToSumToNUsingArrayElementsWithRepetition.waysToCount(inputArrayB, inputNumberB));
    }
}
