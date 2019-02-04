package algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaysToSumToNTest {

    @org.junit.jupiter.api.Test
    void waysToCountTest() {

        int inputArrayA[] = {1, 5, 6};
        int inputNumberA = 7;
        int expectedNumberA = 6;

        int inputArrayB[] = {1, 3, 5};
        int inputNumberB = 6;
        int expectedNumberB = 8;

        assertEquals(expectedNumberA, WaysToSumToN.waysToCount(inputArrayA, inputNumberA));
        assertEquals(expectedNumberB, WaysToSumToN.waysToCount(inputArrayB, inputNumberB));
    }
}
