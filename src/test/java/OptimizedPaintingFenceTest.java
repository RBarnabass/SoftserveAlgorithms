import Algorithms.OptimizedPaintingFence;

import static org.junit.jupiter.api.Assertions.*;

public class OptimizedPaintingFenceTest {

    @org.junit.jupiter.api.Test
    void optimizedPaintingFenceTest() {

        int testInputN = 2;
        int testInputK = 4;
        long testOutput = 16;

        assertEquals(testOutput, OptimizedPaintingFence.optimizedPaintingFence(testInputN, testInputK));
    }

}
