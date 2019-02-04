package algorithms;

import algorithms.Fibonacci;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci(new Scanner(System.in));

    @org.junit.jupiter.api.Test
    void findFibonacciMemberTest() {

        int testInputA = 3;
        int testOutputA = 3;

        int testInputB = 5;
        int testOutputB = 8;

        int testInputC = 10;
        int testOutputC = 89;

        assertEquals(testOutputA, this.fibonacci.findFibonacciMember(testInputA));
        assertEquals(testOutputB, this.fibonacci.findFibonacciMember(testInputB));
        assertEquals(testOutputC, this.fibonacci.findFibonacciMember(testInputC));
    }
}