import algorithms.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private Palindrome palindrome = new Palindrome();
    private String input;

    @Test
    void testEmptyString() {
        input = "";
        assertEquals(0, palindrome.getLongestPalindrome(input, 0, input.length() - 1));
    }

    @Test
    void testOneCharString() {
        input = "a";
        assertEquals(1, palindrome.getLongestPalindrome(input, 0, input.length() - 1));
    }

    @Test
    void testFullStringPalindrome() {
        input = "aibohphobia";
        assertEquals(11, palindrome.getLongestPalindrome(input, 0, input.length() - 1));
    }

    @Test
    void testNotFullStringPalindrome() {
        input = "banana";
        assertEquals(5, palindrome.getLongestPalindrome(input, 0, input.length() - 1));
    }

    @Test
    void testSymbolsString() {
        input = "you have new level";
        assertEquals(7, palindrome.getLongestPalindrome(input, 0, input.length() - 1));
    }
}