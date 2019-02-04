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

        int min = array[0];
        int max = array[0];

        for (int i1 : array) {

            if (i1 < min) {
                min = i1;
            }
            if (i1 > max) {
                max = i1;
            }
        }

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

    @Override
    public void execute() {
        int[] array = userInputArray();
        array = countingSort(array);
        System.out.println("Your array after sorting: " + Arrays.toString(array));

    }
}
