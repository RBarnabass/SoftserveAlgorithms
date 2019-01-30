package Algorithms;


public class PathsWithoutCrossing {

    /**
     * @param numberOfPoints
     * @return
     */
    public static int countPaths(int numberOfPoints) {

        if (numberOfPoints % 2 != 0) {
            return 0;
        }

        return catalanNumber(numberOfPoints / 2);
    }

    /**
     * @param n
     * @return
     */
    public static int catalanNumber(int n) {

        int[] catalan = new int[n + 1];

        catalan[0] = 1;
        catalan[1] = 1;

        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }

        return catalan[n];
    }
}
