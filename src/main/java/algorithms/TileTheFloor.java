package algorithms;

import strategy.IAlgorithmStrategy;
import utilities.UserInputValidator;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Count ways to tile the floor with given measures
 *
 * @author Arsen
 */
public class TileTheFloor implements IAlgorithmStrategy {

    /**
     * Method for count ways to tile the floor
     *
     * @param n first measure parameter of floor:
     * @param m second measure parameter of floor and tile
     * @return return count of ways to tile the floor
     */
    static int countWays(int n, int m) {
        int count[] = new int[n + 1];
        count[0] = 0;

        int i;
        for (i = 1; i <= n; i++) {
            if (i > m)
                count[i] = count[i - 1] + count[i - m];
            else if (i < m) {
                count[i] = 1;
            } else {
                count[i] = 2;
            }
        }
        return count[n];
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt(UserInputValidator.getUserInput(1, Integer.MAX_VALUE, "Please type integer value bigger then 1"));

        System.out.print("Enter m: ");
        int m = sc.nextInt(UserInputValidator.getUserInput(1, Integer.MAX_VALUE, "Please type integer value bigger then 1"));

        System.out.println("Number of ways = " + countWays(n, m));
    }

    private static void numberBiggerThenOne(Scanner sc) {
        try {
            if (!sc.hasNextInt() || sc.nextInt() < 2) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Please type integer value bigger then 1");
            sc.nextLine();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please type integer value bigger then 1");
            sc.nextLine();
        }
    }
}
