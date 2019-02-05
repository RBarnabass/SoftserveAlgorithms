package controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InstanceCreatorTest {

    private static InstanceCreator init;

    @BeforeAll
    static void before() {
        init = new InstanceCreator();
    }

    @AfterAll
    static void after() {
        init = null;
    }

    @Test
    void nullTest() {
        assertNull(init.getAlgorithm(null));
    }

    @Test
    void exitTest() {
        assertNull(init.getAlgorithm(AlgorithmName.EXIT));
    }
}
