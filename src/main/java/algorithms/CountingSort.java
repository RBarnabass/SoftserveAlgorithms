package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utilities.InputArrayParser.userInputArray;

/**
 * Class that sorts the array by an algorithm of Counter Sort.
 *
 * @author Valentyn Yarmoshyk
 */
public class CountingSort implements IAlgorithmStrategy {

    /**
     * Realise Counter Sort.
     *
     * @param array An array you want to sort
     * @return Sorted array
     */
    int[] countingSort(int[] array) {

        int[] minMaxArray = minMaxOfArray(array);
        int min = minMaxArray[0];
        int max = minMaxArray[1];

        int[] countArray = new int[max - min + 1];

        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = 0;
        }

        for (int i1 : array) {
            countArray[i1 - min]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] != 0) {
                for (int j = 0; j < countArray[i]; j++) {
                    list.add(i + min);
                }
            }
        }

        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }

        return resultArray;
    }

    /**
     * Find min and max in array that you entered.
     *
     * @param array Array of Integers numbers
     * @return Min and max element of array
     */
    int[] minMaxOfArray(int[] array) {

        int[] minMaxArray = new int[2];

        minMaxArray[0] = array[0];   //min
        minMaxArray[1] = array[0];   //max

        for (int i1 : array) {

            if (i1 < minMaxArray[0]) {
                minMaxArray[0] = i1;
            }
            if (i1 > minMaxArray[1]) {
                minMaxArray[1] = i1;
            }
        }

        return minMaxArray;

    }

    @Override
    public void execute() {
        int[] array = userInputArray();
        array = countingSort(array);
        System.out.println("Your array after sorting: " + Arrays.toString(array));

    }
}
