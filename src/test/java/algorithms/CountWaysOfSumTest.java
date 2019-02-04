package algorithms;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CountWaysOfSumTest {
    private CountWaysOfSum countWaysOfSum = new CountWaysOfSum(new Scanner(System.in));

    @Test
    void testN_IsOne() {
        assertEquals(0, countWaysOfSum.countWays(1));
    }

    @Test
    void testN_IsTwo() {
        assertEquals(1, countWaysOfSum.countWays(2));
    }

    @Test
    void testN_IsFive() {
        assertEquals(6, countWaysOfSum.countWays(5));
    }

    @Test
    void testN_IsHundred() {
        assertEquals(190569291, countWaysOfSum.countWays(100));
    }
}