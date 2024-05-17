package excercises.twoStrings;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-04-18
 */
public class TwoStringsTest {

    @Test
    public void testTwoStringsPositiveCase() {
        String s1 = "hello";
        String s2 = "world";
        String expected = "YES";
        String actual = TwoStrings.twoStrings(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoStringsNegativeCase() {
        String s1 = "abc";
        String s2 = "def";
        String expected = "NO";
        String actual = TwoStrings.twoStrings(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoStringsEmptyStrings() {
        String s1 = "";
        String s2 = "";
        String expected = "NO";
        String actual = TwoStrings.twoStrings(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoStringsOneEmptyString() {
        String s1 = "abc";
        String s2 = "";
        String expected = "NO";
        String actual = TwoStrings.twoStrings(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoStringsCommonCharacterAtBeginning() {
        String s1 = "abc";
        String s2 = "a123";
        String expected = "YES";
        String actual = TwoStrings.twoStrings(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoStringsCommonCharacterAtEnd() {
        String s1 = "xyz";
        String s2 = "789y";
        String expected = "YES";
        String actual = TwoStrings.twoStrings(s1, s2);
        assertEquals(expected, actual);
    }
}
