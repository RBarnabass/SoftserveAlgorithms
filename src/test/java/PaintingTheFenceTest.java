package painting;

import static org.junit.Assert.assertEquals;

public class PaintingTheFenceTest {

    @org.junit.Test
    public void paintingTheFenceTest() {

        int n = 2;
        int k = 4;
        long result = 16;
        assertEquals(result, PaintingTheFence.paintingTheFence(n, k));

    }
}