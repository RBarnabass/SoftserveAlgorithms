package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Get correct input from user.
 *
 * @return final and correct user input
 */
public class UserInputValidator {
    public static int getUserInput(int lowerBound, int upperBound, String errorMessage) {

        Scanner sc = new Scanner(System.in);

        int input;

        try {
            input = sc.nextInt();

            if(input < lowerBound || input > upperBound) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {

            System.out.println(errorMessage);
            input = getUserInput(lowerBound, upperBound, errorMessage);
        }

        return input;
    }
}
