package algorithms;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {
    private static InsertionSort insertionSort;


    @BeforeAll
    public static void initTest() {
        insertionSort = new InsertionSort();
    }

    @AfterAll
    public static void afterTest() {
        insertionSort = null;
    }

    @org.junit.jupiter.api.Test
    void doInsertionSortTest() {

        int[] inputArrayA = {52, 10, 6, 40};
        int[] expectedArrayA = {6, 10, 40, 52};

        int[] inputArrayB = {21, 10, 7, 20};
        int[] expectedArrayB = {7, 10, 20, 21};

        assertArrayEquals(expectedArrayA, insertionSort.doInsertionSort(inputArrayA));
        assertArrayEquals(expectedArrayB, insertionSort.doInsertionSort(inputArrayB));
    }
}
