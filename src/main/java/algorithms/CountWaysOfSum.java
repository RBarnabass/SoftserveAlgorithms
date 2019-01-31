package algorithms;

public class CountWaysOfSum {
    /**
     * Returns how many ways is possible to calculate n with positive integers.
     *
     * @param n positive integer
     * @return count of ways
     */
    public int countWays(int n) {
        int[] ways = new int[n + 1];
        ways[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                ways[j] += ways[j - i];
            }
        }
        return ways[n];
    }
}
