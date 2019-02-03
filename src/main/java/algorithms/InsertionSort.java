package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.Arrays;

import static utilities.Util.userInputArray;

/**
 * Class that sorts the array by an algorithm Insertion Sort.
 *
 * @author Ostap Vdovychyn
 * @version 1.0
 */
public class InsertionSort implements IAlgorithmStrategy {
    /**
     * Realise Insertion sort.
     *
     * @param array expected array
     * @return sorted array
     */
    public int[] doInsertionSort(int[] array) {
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

    @Override
    public void execute() {
        int[] array = userInputArray();
        array = doInsertionSort(array);
        System.out.println("Your array after Insertion Sort: " + Arrays.toString(array));

    }
}