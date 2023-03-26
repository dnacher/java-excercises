package excercises.beautifulBinaryString;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-21
 */
public class BeautifulBinaryStringTest {

    @Test
    public void testBeautifulBinaryString() {
        String b = "0101010101010101";
        int expected = 4;
        int actual = BeautifulBinaryString.beautifulBinaryString(b);
        assertEquals(expected, actual);
    }

    @Test
    public void testBeautifulBinaryString2() {
        String b = "0101010";
        int expected = 2;
        int actual = BeautifulBinaryString.beautifulBinaryString(b);
        assertEquals(expected, actual);
    }

    @Test
    public void testBeautifulBinaryString3() {
        String b = "01100";
        int expected = 0;
        int actual = BeautifulBinaryString.beautifulBinaryString(b);
        assertEquals(expected, actual);
    }

    @Test
    public void testBeautifulBinaryString4() {
        String b = "0100101010";
        int expected = 3;
        int actual = BeautifulBinaryString.beautifulBinaryString(b);
        assertEquals(expected, actual);
    }
}
