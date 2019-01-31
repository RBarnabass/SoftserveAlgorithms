package algorithms;

public class Fibonacci {

    /**
     * Returns the member of position in Fibonacci sequence
     *
     * @param number position in Fibonacci sequenc
     * @return member of position in Fibonacci sequence
     * @author Nazar Mavko
     */
    public static int findFibonacciMember(int number) {
        int[] fibonacciArray = new int[number + 2];
        fibonacciArray[1] = 1;
        fibonacciArray[2] = 2;
        for (int i = 3; i <= number; i++) {
            fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
        }
        return fibonacciArray[number];
    }
}
