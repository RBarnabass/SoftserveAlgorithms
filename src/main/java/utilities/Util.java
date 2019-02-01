package utilities;

import java.util.Arrays;
import java.util.Scanner;

public class Util {

    /**
     * Ipput a positive number
     *
     * @return A positive number
     * @author Valentyn Yarmoshyk
     */
    public static int enterPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number must be Integer type and more than 0");
        int number;
        int counter = 0;
        do {
            if (counter > 0) {
                System.out.println("Enter the correct value, please!");
            }
            counter++;
            while (!scanner.hasNextInt()) {

                System.out.println("Enter the correct value, please!");
                scanner.next();

            }
            number = scanner.nextInt();
        } while (number <= 0);

        return number;
    }

    /**
     * Return the length of the array
     *
     * @return The length of the array
     * @author Valentyn Yarmoshyk
     */
    public static int lengthOfArray() {
        System.out.println("How much elements? ");
        int length = enterPositiveNumber();
        System.out.println("The length of your array is " + length);
        return length;
    }

    /**
     * Return the array that you entered
     *
     * @return An array
     * @author Valentyn Yarmoshyk
     */
    public static int[] writeArray() {
        Scanner scanner = new Scanner(System.in);
        int length = lengthOfArray();

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
