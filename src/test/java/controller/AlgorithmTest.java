package controller;

import org.junit.jupiter.api.Test;
import static controller.Algorithm.getAlgorithmName;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmTest {

    @Test public void negativeTest() {
        assertEquals(Algorithm.EXIT, getAlgorithmName(-1));
    }

    @Test public void overTest() {
        assertEquals(Algorithm.EXIT, getAlgorithmName(20));
    }

    @Test public void maxTest() {
        assertEquals(Algorithm.EXIT, getAlgorithmName(Integer.MAX_VALUE));
    }
}
