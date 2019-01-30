import Algorithms.Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @org.junit.jupiter.api.Test
    void findFibonacciMemberTest() {

        int testInputA = 3;
        int testOutputA = 3;

        int testInputB = 5;
        int testOutputB = 8;

        int testInputC = 10;
        int testOutputC = 89;

        assertEquals(testOutputA, Fibonacci.findFibonacciMember(testInputA));
        assertEquals(testOutputB, Fibonacci.findFibonacciMember(testInputB));
        assertEquals(testOutputC, Fibonacci.findFibonacciMember(testInputC));
    }
}