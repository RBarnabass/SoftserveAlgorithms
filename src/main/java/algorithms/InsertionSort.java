package algorithms;

/**
 * Class that sorts the array by an algorithm Insertion Sort
 *
 * @version 1.0
 * @author Ostap Vdovychyn
 */
public class InsertionSort {
    /**
     *  Realise Insertion sort
     * @param array expected array
     * @return sorted array
     */
    public static int[] doInsertionSort(int[] array) {
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
