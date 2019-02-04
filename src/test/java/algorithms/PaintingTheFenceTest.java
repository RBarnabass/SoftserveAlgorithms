package algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintingTheFenceTest {

    @org.junit.jupiter.api.Test
    public void paintingTheFenceTest() {

        PaintingTheFence paintingTheFence = new PaintingTheFence();

        int n = 2;
        int k = 4;
        long result = 16;
        assertEquals(result, paintingTheFence.paintingTheFence(n, k));

    }
}