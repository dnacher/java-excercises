package excercises.separateTheNumbers;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Daniel Nacher
 * 2024-06-18
 */
public class SeparateTheNumbersTest {

    @Test
    public void test() {
        assertEquals("YES 1", SeparateTheNumbers.separateNumbers("1234"));
    }

    @Test
    public void test2() {
        assertEquals("YES 9", SeparateTheNumbers.separateNumbers("91011"));
    }

    @Test
    public void test3() {
        assertEquals("YES 99", SeparateTheNumbers.separateNumbers("99100"));
    }

    @Test
    public void test4() {
        assertEquals("NO", SeparateTheNumbers.separateNumbers("101103"));
    }

    @Test
    public void test5() {
        assertEquals("NO", SeparateTheNumbers.separateNumbers("010203"));
    }

    @Test
    public void test6() {
        assertEquals("NO", SeparateTheNumbers.separateNumbers("13"));
    }

    @Test
    public void test7() {
        assertEquals("NO", SeparateTheNumbers.separateNumbers("1"));
    }

}
