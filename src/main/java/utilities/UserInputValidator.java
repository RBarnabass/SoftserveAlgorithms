package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Get correct input from user.
 *
 * @author Oleh Volchkov
 */
public class UserInputValidator {

    // TODO: javadoc
    private static Scanner sc = new Scanner(System.in);

    /**
     * Continuously asking user for integer input while it won't accord with given bounds and returns it.
     *
     * @param lowerBound minimal allowed value for user input
     * @param upperBound maximal allowed value for user input
     * @param errorMessage message which prints to user when he enters incorrect value
     * @return final input which remains in given min-max values range
     */
    public static int getUserInput(int lowerBound, int upperBound, String errorMessage) {

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
