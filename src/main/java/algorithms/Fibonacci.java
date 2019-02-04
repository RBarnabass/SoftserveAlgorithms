package algorithms;

import strategy.IAlgorithmStrategy;

import static utilities.UserInputValidator.getUserInput;

/**
 * Class that returns member of position in Fibonacci sequence
 *
 * @author Nazar Mavko
 */
public class Fibonacci implements IAlgorithmStrategy {

    /**
     * Returns the member of position in Fibonacci sequence
     *
     * @param number position in Fibonacci sequenc
     * @return member of position in Fibonacci sequence
     */
    public static int findFibonacciMember(int number) {
        int[] fibonacciArray = new int[number + 2];
        fibonacciArray[1] = 1;
        fibonacciArray[2] = 2;
        for (int i = 3; i <= number; i++) {
            fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
        }
        return fibonacciArray[number];
    }

    /**
     * Runner method for execution of algorithm.
     */
    public void execute() {
        System.out.println("Please enter a position for a number in Fibonacci sequence you want to know");
        int minNumber = 0;
        int maxNumber = 45;
        String incorrectInputMessage = "\"Please enter number that >0 and <=45\"";
        int number = getUserInput(minNumber, maxNumber, incorrectInputMessage);
        System.out.println(findFibonacciMember(number));
    }
}
