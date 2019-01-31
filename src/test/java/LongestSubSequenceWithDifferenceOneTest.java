import algorithms.LongestSubSequenceWithDifferenceOne;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestSubSequenceWithDifferenceOneTest {

    private static LongestSubSequenceWithDifferenceOne sequence;
    private int[] test;

    @BeforeAll public static void initTest() {
        sequence = new LongestSubSequenceWithDifferenceOne();
    }
    @AfterAll public static void afterTest() {
        sequence = null;
    }

    @Test public void nullTest() {
        assertNotNull(sequence);
    }

    @Test public void oneElementTest() {
        test = new int[] {0};
        assertEquals(1, sequence.getTheLongestOne(test));
    }
    @Test public void twoElementTest() {
        test = new int[] {0, 2};
        assertEquals(1, sequence.getTheLongestOne(test));
    }

    @Test public void twoSequenceElementTest() {
        test = new int[] {0, 1};
        assertEquals(2, sequence.getTheLongestOne(test));
    }
    @Test public void fiveSequenceElementTest() {
        test = new int[] {0, 1, 2, 3, 4};
        assertEquals(5, sequence.getTheLongestOne(test));
    }
    @Test public void fiveSequenceMixedElementTest() {
        test = new int[] {0, 3, 1, 4, 2, 5, 3, 6, 4};
        assertEquals(5, sequence.getTheLongestOne(test));
    }
    @Test public void fiveSequenceDoubleElementTest() {
        test = new int[] {0, 7, 1, 8, 2, 9, 3, 10, 4, 11};
        assertEquals(5, sequence.getTheLongestOne(test));
    }
    @Test public void sixSequenceLongerThenFiveElementTest() {
        test = new int[] {0, 7, 1, 8, 2, 9, 3, 10, 4, 11, 6, 12};
        assertEquals(6, sequence.getTheLongestOne(test));
    }
    @Test public void tenSequenceWaveElementTest() {
        test = new int[] {0, 7, 1, 8, 2, 9, 1, 10, 2, 11, 3, -1, 4, 0, 3, 1, 4, 2, 5};
        assertEquals(10, sequence.getTheLongestOne(test));
    }
}
