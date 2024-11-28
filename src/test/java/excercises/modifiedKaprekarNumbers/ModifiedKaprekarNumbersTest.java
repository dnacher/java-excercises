package excercises.modifiedKaprekarNumbers;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


/**
 * Daniel Nacher
 * 2024-07-02
 */
public class ModifiedKaprekarNumbersTest {

    @Test
    public void test() {
        assertEquals("1 9 45 55 99", ModifiedKaprekarNumbers.kaprekarNumbers(1, 100));
    }

    @Test
    public void test2() {
        assertEquals("297", ModifiedKaprekarNumbers.kaprekarNumbers(100, 300));
    }

}
