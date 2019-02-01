package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.Arrays;

import static utilities.Util.writeArray;

/**
 * Class that sorts the array by an algorithm Merge Sort
 *
 * @version 1.0
 * @author Valentyn Yarmoshyk
 */
public class MergeSort implements IAlgorithmStrategy {

    /**
     * Realise the merge sort
     *
     * @param array An array you want to sort
     * @return Sorted array
     */
    public static int[] mergeSort(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }

        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[midpoint + j];
        }

        System.out.println("Left: " + Arrays.toString(left));
        left = mergeSort(left);
        System.out.println("Right: " + Arrays.toString(right));
        right = mergeSort(right);

        int[] result = new int[array.length];
        result = merge(left, right);
        return result;
    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPoiner = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {

                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPoiner] = left[leftPointer];
                    resultPoiner++;
                    leftPointer++;
                } else {
                    result[resultPoiner] = right[rightPointer];
                    resultPoiner++;
                    rightPointer++;
                }
            } else if (leftPointer < left.length) {
                result[resultPoiner] = left[leftPointer];
                resultPoiner++;
                leftPointer++;
            } else if (rightPointer < right[rightPointer]) {
                result[resultPoiner] = right[rightPointer];
                resultPoiner++;
                rightPointer++;
            }
        }

        return result;

    }

    public void execute() {
        int[] array = writeArray();
        array = mergeSort(array);
        System.out.println("Your array after sorting: " + Arrays.toString(array));

    }
}

