package algorithms;

import algorithms.InterestingRow;

import static org.junit.jupiter.api.Assertions.*;

class InterestingRowTest {

    @org.junit.jupiter.api.Test
    void findInterestingRowMemberTest() {

        int testInputA = 3;
        int testOutputA = 3;

        int testInputB = 5;
        int testOutputB = 11;

        int testInputC = 6;
        int testOutputC = 21;

        assertEquals(testOutputA, InterestingRow.findIntrestingRowMember(testInputA));
        assertEquals(testOutputB, InterestingRow.findIntrestingRowMember(testInputB));
        assertEquals(testOutputC, InterestingRow.findIntrestingRowMember(testInputC));
    }
}