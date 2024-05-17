package excercises.findDigits;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-05-17
 */
public class FindDigitsTest {

    @Test
    public void testSingleDigit() {
        assertEquals(1, FindDigits.findDigits(5));
    }

    @Test
    public void testTwoDigitsBothDivisible() {
        assertEquals(2, FindDigits.findDigits(12));
    }

    @Test
    public void testTwoDigitsNoneDivisibles() {
        assertEquals(0, FindDigits.findDigits(23));
    }

    @Test
    public void testNumberWithZero() {
        assertEquals(2, FindDigits.findDigits(105));
    }

    @Test
    public void testNumberWithRepeatedDigits() {
        assertEquals(3, FindDigits.findDigits(122));
    }

    @Test
    public void testLargeNumber() {
        assertEquals(3, FindDigits.findDigits(1012));
    }

    @Test
    public void testAllDigitsSame() {
        assertEquals(3, FindDigits.findDigits(111));
    }

    @Test
    public void testNumberWithZerosInBetween() {
        assertEquals(2, FindDigits.findDigits(202));
    }

    @Test
    public void testSingleDigitZero() {
        assertEquals(0, FindDigits.findDigits(0));
    }

}
