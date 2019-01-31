package algorithms;

import strategy.AlgorithmStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static utilities.util.writeArray;

public class CoutingSort implements AlgorithmStrategy {

    public static int[] countingSort(int[] array) {

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] countArray = new int[max - min + 1];

        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }


        List<Integer> list = new ArrayList<Integer>();
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


    public void execute(Scanner sc) {

        int[] array = writeArray(sc);
        array = countingSort(array);
        System.out.println("Your array after Counter Sort: " + Arrays.toString(array));

    }
}
