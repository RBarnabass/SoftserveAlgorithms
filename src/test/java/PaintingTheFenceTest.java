import algorithms.PaintingTheFence;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintingTheFenceTest {

    @org.junit.jupiter.api.Test
    public void paintingTheFenceTest() {

        int n = 2;
        int k = 4;
        long result = 16;
        assertEquals(result, PaintingTheFence.paintingTheFence(n, k));

    }
}