package excercises.validString;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-11
 */
public class ValidStringTest {

    @Test
    public void test() {
        Assertions.assertEquals(true, ValidString.isValidString("{}()[]"));
    }

    @Test
    public void test2() {
        assertEquals(true, ValidString.isValidString("{()[]}"));
    }

    @Test
    public void test3() {
        assertEquals(false, ValidString.isValidString("{[(])}"));
    }

    @Test
    public void test4() {
        assertEquals(false, ValidString.isValidString("((([[[]]]}}}{}{}{}}{()()()()()((((((())))((()(()()()()"));
    }

    @Test
    public void test5() {
        assertEquals(true, ValidString.isValidString("((([[[]]])){}{}[])"));
    }

    @Test
    public void test6() {
        assertEquals(true, ValidString.isValidString("(){}[]"));
    }

    @Test
    public void test7() {
        assertEquals(true, ValidString.isValidString("([{}])"));
    }

    @Test
    public void test8() {
        assertEquals(false, ValidString.isValidString("(]"));
    }

}
