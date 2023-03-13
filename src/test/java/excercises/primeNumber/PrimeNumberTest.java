package excercises.primeNumber;

import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Daniel Nacher
 * 2023-03-13
 */
public class PrimeNumberTest {

    @Test
    public void testPrimeNumber() {
        assertTrue(PrimeNumber.primeNumber(2));
        assertTrue(PrimeNumber.primeNumber(3));
        assertTrue(PrimeNumber.primeNumber(5));
        assertTrue(PrimeNumber.primeNumber(7));
        assertTrue(PrimeNumber.primeNumber(11));
        assertTrue(PrimeNumber.primeNumber(13));
        assertTrue(PrimeNumber.primeNumber(17));
        assertTrue(PrimeNumber.primeNumber(19));
        assertFalse(PrimeNumber.primeNumber(1));
        assertFalse(PrimeNumber.primeNumber(4));
        assertFalse(PrimeNumber.primeNumber(6));
        assertFalse(PrimeNumber.primeNumber(8));
        assertFalse(PrimeNumber.primeNumber(9));
        assertFalse(PrimeNumber.primeNumber(10));
        assertFalse(PrimeNumber.primeNumber(15));
        assertFalse(PrimeNumber.primeNumber(20));
    }
}
