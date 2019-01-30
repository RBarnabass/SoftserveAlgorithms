import Algorithms.InsertionSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IsertionSortTest {

    @org.junit.jupiter.api.Test
    void doInsertionSortTest() {

        int[] inputArray = {52, 10, 6, 40};
        int[] expectedArray = {6, 10, 40, 52};

        assertArrayEquals(expectedArray, InsertionSort.doInsertionSort(inputArray));
    }
}
