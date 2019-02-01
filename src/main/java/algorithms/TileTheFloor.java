package algorithms;

import strategy.AlgorithmStrategy;

import java.util.Scanner;


/**
 * Count ways to tile the floor with given measures
 *
 *
 * @author Arsen
 *
 */
public class TileTheFloor implements AlgorithmStrategy {

    /**
     * Method for count ways to tile the floor
     *
     * @param n first measure parameter of floor:
     * @param m second measure parameter of floor and tile
     * @return return count of ways to tile the floor
     */
    public static int countWays(int n, int m) {

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

    public void execute(Scanner sc) {
        System.out.print("Enter n: ");
        isIntNumber(sc);
        int n = sc.nextInt();

        System.out.print("Enter m: ");
        isIntNumber(sc);
        int m = sc.nextInt();

        System.out.println("Number of ways = " + countWays(n, m));
    }

    private static void isIntNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Int, please!");
            sc.nextLine();
        }
    }
}
