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
     * Return the array that you entered
     *
     * @return An array
     * @author Valentyn Yarmoshyk
     */
    public static int[] userInputArray(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array of Integer space-separated numbers: ");
        String string = scanner.nextLine().trim().replaceAll("\\s+", " ");
        System.out.println(string);

        int[] intArray;

        try{
            String[] stringArray = string.split(" ");
            intArray = new int[stringArray.length];
            for(int i = 0; i < intArray.length; i++){
                intArray[i] = Integer.parseInt(stringArray[i].trim());
            }
            System.out.println("Your array is: " + Arrays.toString(intArray));
        }catch(NumberFormatException e){
            System.out.println("You entered the invalid symbol. Try one more time");s
            intArray = userInputArray();

        }

        return intArray;
    }
}
