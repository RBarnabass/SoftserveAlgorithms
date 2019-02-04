package controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InstanceCreatorTest {

    private static InstanceCreator init;

    @BeforeAll public static void before() {
        init = new InstanceCreator();
    }

    @AfterAll public static void after() {
        init = null;
    }

    @Test public void nullTest() {
        assertNull(init.getAlgorithm(null));
    }

    @Test public void exitTest() {
        assertNull(init.getAlgorithm(Algorithm.EXIT));
    }
}
