package algorithms;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ModificationFibonacciTest {

    private static ModificationFibonacci modificationFibonacci;


    @BeforeAll
    public static void initTest() {
        modificationFibonacci = new ModificationFibonacci(new Scanner(System.in));
    }

    @AfterAll
    public static void afterTest() {
        modificationFibonacci = null;
    }

    @org.junit.jupiter.api.Test
    void modificationFibonacciTest() {

        int testInputA = 3;
        int testOutputA = 1;

        int testInputB = 6;
        int testOutputB = 4;

        int testInputC = 7;
        int testOutputC = 6;

        assertEquals(testOutputA, modificationFibonacci.modificationFibonacci(testInputA));
        assertEquals(testOutputB, modificationFibonacci.modificationFibonacci(testInputB));
        assertEquals(testOutputC, modificationFibonacci.modificationFibonacci(testInputC));
    }

}
