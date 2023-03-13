package excercises.camelCase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-13
 *
 * These tests cover the following cases:
 *
 * Empty string
 * Lowercase string
 * Uppercase string
 * Mixed case string
 * Words separated by numbers
 * Words separated by special characters
 *
 */
public class CamelCaseTest {

    @Test
    public void testCamelcaseWithEmptyString() {
        String s = "";
        int expected = 1;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }

    @Test
    public void testCamelcaseWithLowerCaseString() {
        String s = "hello";
        int expected = 1;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }

    @Test
    public void testCamelcaseWithUpperCaseString() {
        String s = "HELLO";
        int expected = 6;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }

    @Test
    public void testCamelcaseWithMixedCaseString() {
        String s = "HelloWorld";
        int expected = 3;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }

    @Test
    public void testCamelcaseWithWordsSeparatedByNumbers() {
        String s = "hello123world";
        int expected = 1;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }

    @Test
    public void testCamelcaseWithWordsSeparatedBySpecialCharacters() {
        String s = "hello_world";
        int expected = 1;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }

    @Test
    public void testCamelCase1() {
        String s = "helloWorld";
        int expected = 2;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }

    @Test
    public void testCamelCase2() {
        String s = "helloWorldMyNameIsChatGPT";
        int expected = 9;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }

    @Test
    public void testCamelCase3() {
        String s = "hello";
        int expected = 1;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }

    @Test
    public void testCamelCase4() {
        String s = "hELLo";
        int expected = 4;
        int result = CamelCase.camelcase(s);
        assertEquals(expected, result);
    }
}
