package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.Arrays;
import java.util.Scanner;

import static utilities.util.writeArray;

/**
 * QuickSort algorithm for array of numbers
 *
 * @author Arsen Markiv
 */
public class QuickSortAlgorithm implements IAlgorithmStrategy {

    public void execute() {
        Scanner sc = new Scanner(System.in);
        int[] array = writeArray(sc);
        array = quickSort(array);
        System.out.println("Your array after sorting: " + Arrays.toString(array));
    }

    /**
     * Returns array sorted by Quick Sort algorithm
     *
     * @param array array of numbers to sort
     * @return sorted array
     */
    public static int[] quickSort(int[] array) {
        if (array == null) {
            return null;
        }
        sort(array, 0, array.length - 1);
        return array;
    }

    /**
     * Recursive function which sort an array
     *
     * @param array array of numbers to sort
     * @param left  first element of array ( array[0] )
     * @param right last element of array ( array[n-1] )
     */
    private static void sort(int[] array, int left, int right) {
        if (left < right) {
            int p = getPivot(array, left, right);

            sort(array, left, p - 1);
            sort(array, p + 1, right);
        }
    }


    /**
     * @param array array of numbers to sort
     * @param left  first element of array ( array[0] )
     * @param right last element of array ( array[n-1] )
     * @return return partition element
     */
    private static int getPivot(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        array[right] = array[i];
        array[i] = pivot;

        return i;
    }

}
