package algorithms;

import strategy.IAlgorithmStrategy;

import static utilities.UserInputValidator.getUserInput;

/**
 * Class that returns member of position in Interesting Row sequence.
 *
 * @author Nazar Mavko
 */
public class InterestingRow implements IAlgorithmStrategy {

    /**
     * Returns the member of position in Interesting Row sequence.
     *
     * @param number position in interesting row
     * @return member of position in interesting row sequence
     */
    public int findIntrestingRowMember(int number) {
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
    @Override
    public void execute() {
        System.out.println("Please enter a position for a number in Interesting Row sequence you want to know");
        int minNumber = 0;
        int maxNumber = 32;
        String incorrectInputMessage = "\"Please enter number that >0 and <=45\"";
        int number = getUserInput(minNumber, maxNumber, incorrectInputMessage);
        System.out.println(findIntrestingRowMember(number));
    }
}
