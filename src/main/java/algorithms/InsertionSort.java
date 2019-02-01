package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.Arrays;
import java.util.Scanner;

import static utilities.util.writeArray;

/**
 * Class that sorts the array by an algorithm Insertion Sort
 *
 * @author Ostap Vdovychyn
 * @version 1.0
 */
public class InsertionSort implements IAlgorithmStrategy {
    /**
     * Realise Insertion sort
     *
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

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int[] array = writeArray(scanner);
        array = doInsertionSort(array);
        System.out.println("Your array after Insertion Sort: " + Arrays.toString(array));

    }
}