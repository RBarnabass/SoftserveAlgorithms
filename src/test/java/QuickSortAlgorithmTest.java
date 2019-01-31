import algorithms.QuickSortAlgorithm;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortAlgorithmTest {

    @org.junit.jupiter.api.Test
    void sortArray() {

        int[] outputArray1 = {1, 6, 12, 32, 34, 43, 54, 342};
        int[] inputArray1 = {43, 34, 6, 12, 342, 54, 32, 1};

        int[] outputArray2 = {1, 2, 3, 6, 32, 54, 78};
        int[] inputArray2 = {6, 2, 32, 1, 78, 54, 3};

        int[] outputArray3 = {-8, 1, 2, 3, 4, 5};
        int[] inputArray3 = {4, 3, 2, -8, 5, 1};

        assertArrayEquals(outputArray1, QuickSortAlgorithm.quickSort(inputArray1));
        assertArrayEquals(outputArray2, QuickSortAlgorithm.quickSort(inputArray2));
        assertArrayEquals(outputArray3, QuickSortAlgorithm.quickSort(inputArray3));

    }
}
