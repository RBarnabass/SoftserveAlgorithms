package controller;

import org.junit.jupiter.api.Test;
import static controller.Algorithm.getAlgorithmName;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    void negativeTest() {
        assertEquals(Algorithm.EXIT, getAlgorithmName(-1));
    }

    @Test
    void overTest() {
        assertEquals(Algorithm.EXIT, getAlgorithmName(20));
    }

    @Test
    void maxTest() {
        assertEquals(Algorithm.EXIT, getAlgorithmName(Integer.MAX_VALUE));
    }
}
