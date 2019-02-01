package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.Scanner;

/**
 * Optimized painting fence algorithm with one variable instead of a table
 *
 * @author Andrii Senchakevych
 */
public class OptimizedPaintingFence implements IAlgorithmStrategy {

    /**
     * Returns number of ways of painting the fence such that at most 2 adjacent posts have the same color
     *
     * @param n n numbers of posts
     * @param k n numbers of colors
     * @return number of ways of painting the fence
     */
    public static long optimizedPaintingFence(int n, int k) {

        long total = k;
        long same = 0;
        long diff = k;

        for (int i = 2; i <= n; i++) {

            same = diff;
            diff = total * (k - 1);
            total = (same + diff);
        }

        return total;
    }

    public void execute(Scanner sc) {

        int n;
        int k;

        System.out.println("Enter numbers of posts");
        n = sc.nextInt();
        System.out.println("Enter numbers of colors");
        k = sc.nextInt();
        System.out.println("Number of ways is " + optimizedPaintingFence(n, k));

    }
}
