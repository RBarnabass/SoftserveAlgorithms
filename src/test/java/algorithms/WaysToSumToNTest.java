package algorithms;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaysToSumToNTest {

    private static WaysToSumToN waysToSumToN;


    @BeforeAll
    public static void initTest() {
        waysToSumToN = new WaysToSumToN(new Scanner(System.in));
    }

    @AfterAll
    public static void afterTest() {
        waysToSumToN = null;
    }

    @org.junit.jupiter.api.Test
    void waysToCountTest() {


        int[] inputArrayA = {1, 5, 6};
        int inputNumberA = 7;
        int expectedNumberA = 6;

        int[] inputArrayB = {1, 3, 5};
        int inputNumberB = 6;
        int expectedNumberB = 8;

        assertEquals(expectedNumberA, waysToSumToN.waysToCount(inputArrayA, inputNumberA));
        assertEquals(expectedNumberB, waysToSumToN.waysToCount(inputArrayB, inputNumberB));
    }
}
