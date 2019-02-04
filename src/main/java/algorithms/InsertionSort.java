package algorithms;

import strategy.IAlgorithmStrategy;

import static utilities.InputArrayParser.userInputArray;

/**
 * Class that sorts the array by an algorithm Insertion Sort.
 *
 * @author Ostap Vdovychyn
 */
public class InsertionSort implements IAlgorithmStrategy {

    /**
     * Realise Insertion sort.
     *
     * @param array expected array
     * @return sorted array
     */
    public int[] doInsertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j);
                }
            }
        }

        return array;
    }

    /**
     * Changes the index of the array.
     *
     * @param array array that is sorted
     * @param j     index of array
     */
    private void swap(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }

    @Override
    public void execute() {
        int[] array = userInputArray();
        doInsertionSort(array);
    }
}