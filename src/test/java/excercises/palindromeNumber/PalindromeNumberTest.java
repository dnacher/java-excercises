package excercises.palindromeNumber;

import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Daniel Nacher
 * 2023-03-13
 */
public class PalindromeNumberTest {

    @Test
    public void testPalindromeNumber() {
        assertTrue(PalindromeNumber.palindromeNumber(121));
        assertTrue(PalindromeNumber.palindromeNumber(1221));
        assertTrue(PalindromeNumber.palindromeNumber(12321));
        assertFalse(PalindromeNumber.palindromeNumber(123));
        assertFalse(PalindromeNumber.palindromeNumber(12345));
        assertTrue(PalindromeNumber.palindromeNumber(-121));
    }
}
