package algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    @org.junit.jupiter.api.Test
    void mergeSort() {
        MergeSort mergeSort = new MergeSort();
        int[] expectedArray = {1, 2, 3, 4};
        int[] inputArray = {3, 1 , 2, 4};

        assertArrayEquals(expectedArray, mergeSort.mergeSort(inputArray));

    }
}