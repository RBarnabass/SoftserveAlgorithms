package algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {


    @org.junit.jupiter.api.Test
    void doInsertionSortTest() {

        int[] inputArrayA = {52, 10, 6, 40};
        int[] expectedArrayA = {6, 10, 40, 52};

        int[] inputArrayB = {21, 10, 7, 20};
        int[] expectedArrayB = {7, 10, 20, 21};

        assertArrayEquals(expectedArrayA, InsertionSort.doInsertionSort(inputArrayA));
        assertArrayEquals(expectedArrayB, InsertionSort.doInsertionSort(inputArrayB));
    }
}
