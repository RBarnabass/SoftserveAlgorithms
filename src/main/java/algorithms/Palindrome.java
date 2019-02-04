package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.Scanner;

/**
 * The Palindrome class that implements algorithm of calculating the longest
 * palindromic subsequence in a sequence.
 *
 * @author Iryna Shturyn
 */
public class Palindrome implements IAlgorithmStrategy {
    /**
     * Returns the length of the longest palindromic subsequence in a sequence.
     *
     * @param input     String not more than 100 symbols
     * @param firstChar index of the first char of input
     * @param lastChar  index of the last char of input
     * @return length of the longest palindromic
     */
    int getLongestPalindrome(String input, int firstChar, int lastChar) {
        if (input.isEmpty()) {
            return 0;
        }
        if (firstChar == lastChar) {
            return 1;
        }

        if (input.charAt(firstChar) == input.charAt(lastChar)) {
            return getLongestPalindrome(input, firstChar + 1, lastChar - 1) + 2;
        }
        return getMaxNumber(getLongestPalindrome(input, firstChar, lastChar - 1),
                getLongestPalindrome(input, firstChar + 1, lastChar));
    }

    /**
     * Returns the biggest number of two compered.
     *
     * @param number1 first number
     * @param number2 second number
     * @return the biggest number
     */
    private int getMaxNumber(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter String with length no more than 100: ");

        String input = sc.nextLine();
        int palindromeLength = getLongestPalindrome(input, 0, input.length() - 1);
        System.out.println("The length of the longest palindrome subsequence is: " + palindromeLength);
    }

}


