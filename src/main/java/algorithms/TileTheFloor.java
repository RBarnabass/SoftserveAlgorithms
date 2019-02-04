package algorithms;

import strategy.IAlgorithmStrategy;
import utilities.UserInputValidator;

import java.util.Scanner;


/**
 * Count ways to tile the floor with given measures.
 *
 * @author Arsen
 */
public class TileTheFloor implements IAlgorithmStrategy {

    private UserInputValidator userInput;

    public TileTheFloor(Scanner sc) {

        userInput = new UserInputValidator(sc);
    }

    /**
     * Method for count ways to tile the floor.
     *
     * @param n first measure parameter of floor:
     * @param m second measure parameter of floor and tile
     * @return return count of ways to tile the floor
     */
    public int countWays(int n, int m) {
        int[] count = new int[n + 1];
        count[0] = 0;

        for (int i = 1; i <= n; i++) {
            if (i > m) {
                count[i] = count[i - 1] + count[i - m];
            } else if (i < m) {
                count[i] = 1;
            } else {
                count[i] = 2;
            }
        }
        return count[n];
    }

    @Override
    public void execute() {
        final int minValue = 1;
        String errorMessage = "Please type integer value bigger then 1";

        System.out.print("Enter n: ");
        int n = userInput.getUserInput(minValue, Integer.MAX_VALUE, errorMessage);

        System.out.print("Enter m: ");
        int m = userInput.getUserInput(minValue, Integer.MAX_VALUE, errorMessage);

        System.out.println("Number of ways = " + countWays(n, m));
    }
}
