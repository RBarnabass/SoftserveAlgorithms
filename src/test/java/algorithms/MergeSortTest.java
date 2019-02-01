package algorithms;

import algorithms.MergeSort;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @org.junit.jupiter.api.Test
    void mergeSort() {

        int[] expectedArray = {1, 2, 3, 4};
        int[] inputArray = {3, 1 , 2, 4};

        assertArrayEquals(expectedArray, MergeSort.mergeSort(inputArray));

    }
}