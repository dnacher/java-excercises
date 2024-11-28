package excercises.timeWords;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-24
 */
public class TimeWordsTest {

    @Test
    public void test() {
        assertEquals("thirteen minutes to six", TimeWords.timeInWords(5, 47));
    }

    @Test
    public void test2() {
        assertEquals("quarter past seven", TimeWords.timeInWords(7,15));
    }

    @Test
    public void test3() {
        assertEquals("three o' clock", TimeWords.timeInWords(3,00));
    }

    @Test
    public void test4() {
        assertEquals("quarter to six", TimeWords.timeInWords(5,45));
    }
}
