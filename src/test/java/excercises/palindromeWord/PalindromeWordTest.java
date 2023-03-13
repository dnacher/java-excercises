package excercises.palindromeWord;

import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Daniel Nacher
 * 2023-03-13
 */
public class PalindromeWordTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeWord.isPalindrome("racecar"));
        assertTrue(PalindromeWord.isPalindrome("level"));
        assertTrue(PalindromeWord.isPalindrome("deified"));
        assertTrue(PalindromeWord.isPalindrome("rotor"));
        assertFalse(PalindromeWord.isPalindrome("hello"));
        assertFalse(PalindromeWord.isPalindrome("world"));
        assertFalse(PalindromeWord.isPalindrome("java"));
        assertFalse(PalindromeWord.isPalindrome("programming"));
        assertFalse(PalindromeWord.isPalindrome("openai"));
    }
}
