package Algorithms;

/**
 * Class that sorts the array by an algorithm Insertion Sort
 *
 * @version 1.0
 * @autor Vdovychyn Ostap
 */
public class InsertionSort {
    /**
     *  Realise Insertion sort
     * @param array expected array
     * @return sorted array
     */
    public static int[] doInsertionSort(int[] array) {
        /**
         * temporary variable
         */
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}
