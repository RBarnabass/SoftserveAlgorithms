package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class MergeSort {

    /**
     * Return the length of the array
     *
     * @param scanner For input data
     * @return The length of the array
     * @author Valentyn Yarmoshyk
     */
    public static int lengthOfArray(Scanner scanner) {
        System.out.print("How much elements: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Int, please!");
            scanner.nextLine();
        }
        int length = scanner.nextInt();
        System.out.println("The length of yout array is " + length);

        return length;
    }

    /**
     * The main method that start the programm
     *
     * @param scanner For input data
     * @author Valentyn Yarmoshyk
     */
    public static void start(Scanner scanner) {

        int[] array = writeArray(scanner);
        array = mergeSort(array);
        System.out.println("Your array after sorting: " + Arrays.toString(array));

    }

    /**
     * Return the array that you wrote
     *
     * @param scanner For input data
     * @return An array
     * @author Valentyn Yarmoshyk
     */
    public static int[] writeArray(Scanner scanner) {

        int length = lengthOfArray(scanner);

        int[] array = new int[length];
        int i = 0;

        while (i < array.length) {

            System.out.print("Enter the " + i + " element: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Int, please!");
                scanner.nextLine();
            }

            array[i] = scanner.nextInt();
            i++;

        }
        System.out.println("Your array: " + Arrays.toString(array));
        return array;
    }

    /**
     * Realise the merge sort
     *
     * @param array An array you want to sort
     * @return Sorted array
     * @author Valentyn Yarmoshyk
     */
    public static int[] mergeSort(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }

        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < midpoint; j++) {
            right[j] = array[midpoint + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        int[] result = new int[array.length];
        result = merge(left, right);
        return result;
    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPoiner = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {

                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPoiner] = left[leftPointer];
                    resultPoiner++;
                    leftPointer++;
                } else {
                    result[resultPoiner] = right[rightPointer];
                    resultPoiner++;
                    rightPointer++;
                }
            } else if (leftPointer < left.length) {
                result[resultPoiner] = left[leftPointer];
                resultPoiner++;
                leftPointer++;
            } else if (rightPointer < right[rightPointer]) {
                result[resultPoiner] = right[rightPointer];
                resultPoiner++;
                rightPointer++;
            }
        }

        return result;

    }


}

