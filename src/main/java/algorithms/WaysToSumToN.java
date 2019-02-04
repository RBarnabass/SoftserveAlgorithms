package algorithms;

import strategy.IAlgorithmStrategy;

import static utilities.InputArrayParser.userInputArray;
import static utilities.UserInputValidator.getUserInput;


/**
 * Calculating how many ways we have to represent one number with a given array of numbers using dynamic programming.
 *
 * @author Ostap Vdovychyn
 */
public class WaysToSumToN implements IAlgorithmStrategy {

    /**
     * Return number which show how many ways we have to represent one number with a given array of numbers.
     *
     * @param arr    Input array, elements in the array will be counting
     * @param number Input number which has to be represented
     * @return count[number] of possible ways we have to represent one number with a given array of numbers
     */
    public int waysToCount(int[] arr, int number) {
        int[] count = new int[number + 1];
        count[0] = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j]) {
                    count[i] += count[i - arr[j]];
                }
            }
        }

        return count[number];
    }

    @Override
    public void execute() {
        System.out.println("Enter the number which has to be represented: ");
        System.out.println("The number must be non-negative");
        String incorrectInputMessage = "Incorrect input. Please, provide integer value that bigger than 0";
        int number = getUserInput(0, Integer.MAX_VALUE, incorrectInputMessage);
        ;
        System.out.println("Enter array which will be counting ");
        int[] array = userInputArray();
        int ways = waysToCount(array, number);
        StringBuilder result = new StringBuilder()
                .append("There is ").append(ways)
                .append(" ways we have to represent one number with a given array of numbers ");
        System.out.println(result);
    }

}