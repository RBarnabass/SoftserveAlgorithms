package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.InputMismatchException;
import java.util.Scanner;

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
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter a position for a number in Fibonacci sequence you want to know or enter \"999\" for exit");
                int number = sc.nextInt();
                if (number > 0 && number <= 45) {
                    System.out.println(findFibonacciMember(number));
                } else if (number == 999) {
                    break;
                } else {
                    System.out.println("Please enter number that >0 and <=45");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Wrong type of input.Please use int type!");
            }
        }
    }
}
