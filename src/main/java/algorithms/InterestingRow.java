package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class that returns member of position in Interesting Row sequence
 *
 * @author Nazar Mavko
 */
public class InterestingRow implements IAlgorithmStrategy {

    /**
     * Returns the member of position in Fibonacci sequence
     *
     * @param number position in interesting row
     * @return member of position in interesting row sequence
     */
    public static int findIntrestingRowMember(int number) {
        int[] interestingRowArray = new int[number + 2];
        interestingRowArray[1] = 1;
        interestingRowArray[2] = 1;
        for (int i = 3; i <= number; i++) {
            interestingRowArray[i] = 2 * interestingRowArray[i - 2] + interestingRowArray[i - 1];
        }
        return interestingRowArray[number];
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
                if (number > 0 && number <= 32) {
                    System.out.println(findIntrestingRowMember(number));
                } else if (number == 999) {
                    break;
                } else {
                    System.out.println("Please enter number that >0 and <=32");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Wrong type of input.Please use int type!");
            }
        }
    }
}

