import algorithms.HighLowEfforts;

import static org.junit.jupiter.api.Assertions.*;

class HighLowEffortsTest {

    @org.junit.jupiter.api.Test
    void findMaximumAmountTest() {

        int[] testInputHighA = {10, 10, 10, 10, 5};
        int[] testInputLowA = {1, 1, 1, 12, 1};
        int numberOfDaysA = 5;
        int testOutputA = 32;

        int[] testInputHighB = {5, 8, 6, 10};
        int[] testInputLowB = {3, 7, 8, 5};
        int numberOfDaysB = 4;
        int testOutputB = 25;

        int[] testInputHighC = {3, 4, 5, 3, 8, 6};
        int[] testInputLowC = {1, 5, 2, 4, 1, 3};
        int numberOfDaysC = 6;
        int testOutputC = 21;

        assertEquals(testOutputA, HighLowEfforts.findMaximumAmount(testInputHighA, testInputLowA, numberOfDaysA));
        assertEquals(testOutputB, HighLowEfforts.findMaximumAmount(testInputHighB, testInputLowB, numberOfDaysB));
        assertEquals(testOutputC, HighLowEfforts.findMaximumAmount(testInputHighC, testInputLowC, numberOfDaysC));
    }
}