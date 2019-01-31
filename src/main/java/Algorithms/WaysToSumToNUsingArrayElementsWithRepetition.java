package Algorithms;

public class WaysToSumToNUsingArrayElementsWithRepetition {
    /**
     * Return number which show how many ways we have to represent one number with a given array of numbers
     *
     * @param arr and number Input array and the number which has to be represented
     * @return count[number] of possible ways we have to represent one number with a given array of numbers
     * @author Ostap Vdovychyn
     */
    public static int waysToCount(int arr[], int number) {
        int count[] = new int[number+1];
        count[0] = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j]) {
                    count[i] += count[i - arr[j]];
                }
            }
        }

        return count[number];
    }
}