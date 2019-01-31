package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class CoutingSort {

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


}
