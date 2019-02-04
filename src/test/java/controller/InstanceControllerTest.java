package controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InstanceControllerTest {

    private static InstanceController init;

    @BeforeAll
    static void before() {
        init = new InstanceController();
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
        assertNull(init.getAlgorithm(Algorithm.EXIT));
    }
}
