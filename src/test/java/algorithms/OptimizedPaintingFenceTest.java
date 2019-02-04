package algorithms;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class OptimizedPaintingFenceTest {

    private static OptimizedPaintingFence optimizedPaintingFence;


    @BeforeAll
    public static void initTest() {
        optimizedPaintingFence = new OptimizedPaintingFence(new Scanner(System.in));
    }

    @AfterAll
    public static void afterTest() {
        optimizedPaintingFence = null;
    }

    @org.junit.jupiter.api.Test
    void optimizedPaintingFenceTest() {

        int testInputN = 2;
        int testInputK = 4;
        long testOutput = 16;

        assertEquals(testOutput, optimizedPaintingFence.optimizedPaintingFence(testInputN, testInputK));
    }

}
