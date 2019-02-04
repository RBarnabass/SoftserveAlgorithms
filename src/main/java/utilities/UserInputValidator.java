package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

// todo: author notation
/**
 * Get correct input from user.
 */
public class UserInputValidator {

    private Scanner sc;

    UserInputValidator(Scanner sc) {
        this.sc = sc;
    }

    /**
     * Continuously asking user for integer input while it won't accord with given bounds and returns it.
     *
     * @param lowerBound minimal allowed value for user input
     * @param upperBound maximal allowed value for user input
     * @param errorMessage message which prints to user when he enters incorrect value
     * @return final input which remains in given min-max values range
     */
    public int getUserInput(int lowerBound, int upperBound, String errorMessage) {

        int input;

        try {

            input = Integer.parseInt(sc.nextLine());

            if (input < lowerBound || input > upperBound) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException | NumberFormatException e) {

            System.out.println(errorMessage);
            input = getUserInput(lowerBound, upperBound, errorMessage);
        }

        return input;
    }
}
