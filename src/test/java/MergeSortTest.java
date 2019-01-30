package merge;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MergeSortTest {

//    @Test
//    void lengthOfArray() {
//
//        assertEquals(8, MergeSort.lengthOfArray(new Scanner(System.in)));
//
//    }

    @Test
    void mergeSort() {

        int[] expectedArray = {1, 2, 3, 4};
        int[] inputArray = {3, 1 , 2, 4};
        Assert.assertArrayEquals(expectedArray, MergeSort.mergeSort(inputArray));

    }
}