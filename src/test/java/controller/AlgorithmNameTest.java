package controller;

import org.junit.jupiter.api.Test;
import static controller.AlgorithmName.getAlgorithmName;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmNameTest {

    @Test
    void negativeTest() {
        assertEquals(AlgorithmName.EXIT, getAlgorithmName(-1));
    }

    @Test
    void overTest() {
        assertEquals(AlgorithmName.EXIT, getAlgorithmName(20));
    }

    @Test
    void maxTest() {
        assertEquals(AlgorithmName.EXIT, getAlgorithmName(Integer.MAX_VALUE));
    }
}
