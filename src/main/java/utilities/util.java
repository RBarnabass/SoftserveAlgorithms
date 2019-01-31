package utilities;

import java.util.Arrays;
import java.util.Scanner;

public class util {
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
     * Return the array that you entered
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
}
