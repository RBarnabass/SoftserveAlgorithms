package algorithms;

import strategy.IAlgorithmStrategy;
import utilities.Util;

/**
 * This class search the longest sequence difference one in the maximum sub sequence.
 *
 * @version 1.0
 * @author Roman Berezhnov
 */
public class LongestSubSequenceWithDifferenceOne implements IAlgorithmStrategy {

    /**
     * This array holds all sequences.
     */
    private int[] sequences;

    /**
     * This is a given array.
     */
    private int[] array;

    /**
     * This method provides the controller logic.
     *
     * @param rowArray this is a given array.
     * @return         length of the greatest sequence.
     */
    public int getTheLongestOne(int[] rowArray) {

        if (rowArray == null) {
            return 0;
        }

        array = rowArray;
        sequences = sequencesArrayInitialization(array.length);
        searchSequences();

        return getResult();
    }

    /**
     * This method search for the greatest sequence.
     *
     * @return length of the greatest sequence.
     */
    private int getResult() {

        int result = 1;

        for (int sequence : sequences) {
            if (result < sequence) {
                result = sequence;
            }
        }

        return result;
    }

    /**
     * This method initializes all array with an initial number.
     * Single element will be one sequence.
     *
     * @param length length of given array.
     * @return       initialized array.
     */
    private int[] sequencesArrayInitialization(int length) {

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        return array;
    }

    /**
     * This method search sequences in a given array.
     */
    private void searchSequences() {

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == (array[j] + 1) || array[i] == (array[j] - 1)) {
                    sequences[i] = Math.max(sequences[i], sequences[j] + 1);
                }
            }
        }
    }

    /**
     * Runner method for execution of algorithm.
     */
    @Override
    public void execute() {
        int[] array = Util.writeArray();
        System.out.println("This is the longest sub sequence - " + getTheLongestOne(array) + "\n");
    }
}
