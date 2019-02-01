package algorithms;

import algorithms.ModificationFibonacci;

import static org.junit.jupiter.api.Assertions.*;

class ModificationFibonacciTest {

    @org.junit.jupiter.api.Test
    void modificationFibonacciTest() {

        int testInputA = 3;
        int testOutputA = 1;

        int testInputB = 6;
        int testOutputB = 4;

        int testInputC = 7;
        int testOutputC = 6;

        assertEquals(testOutputA, ModificationFibonacci.modificationFibonacci(testInputA));
        assertEquals(testOutputB, ModificationFibonacci.modificationFibonacci(testInputB));
        assertEquals(testOutputC, ModificationFibonacci.modificationFibonacci(testInputC));

        assertEquals(testOutputA, ModificationFibonacci.mmodificationFibonacci(testInputA));
        assertEquals(testOutputB, ModificationFibonacci.modificationFibonacci(testInputB));
        assertEquals(testOutputC, ModificationFibonacci.modificationFibonacci(testInputC));
    }

}
