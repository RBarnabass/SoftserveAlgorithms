package Algorithms;

/**
 * Optimized painting fence algorithm with one variable instead of a table
 *
 * @author Andrii Senchakevych
 */

public class OptimizedPaintingFence {

    /**
     * Returns number of ways of painting the fence such that at most 2 adjacent posts have the same color
     *
     * @param n numbers of posts
     * @param k numbers of colors
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
}
