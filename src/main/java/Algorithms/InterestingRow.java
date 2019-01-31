package Algorithms;

public class InterestingRow {
    
    /**
     * Returns the member of position in Fibonacci sequence
     *
     * @param number position in interesting row
     * @return member of position in interesting row sequence
     * @author Nazar Mavko
     */
    public static int findIntrestingRowMember(int number) {
        int[] interestingRowArray = new int[number + 2];
        interestingRowArray[1] = 1;
        interestingRowArray[2] = 1;
        for (int i = 3; i <= number; i++) {
            interestingRowArray[i] = 2 * interestingRowArray[i - 2] + interestingRowArray[i - 1];
        }
        return interestingRowArray[number];
    }
}
