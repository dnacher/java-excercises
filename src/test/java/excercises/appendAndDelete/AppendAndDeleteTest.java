package excercises.appendAndDelete;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-29
 */
public class AppendAndDeleteTest {

    @Test
    public void test() {
        assertEquals("Yes", AppendAndDelete.appendAndDelete("hackerhappy", "hackerrank", 9));
    }

    @Test
    public void test2() {
        assertEquals("Yes", AppendAndDelete.appendAndDelete("aba", "aba", 7));
    }

    @Test
    public void test3() {
        assertEquals("No", AppendAndDelete.appendAndDelete("ashley", "ash", 2));
    }

    @Test
    public void test4() {
        assertEquals("No", AppendAndDelete.appendAndDelete("qwerasdf", "qwerbsdf", 6));
    }

    @Test
    public void test5() {
        assertEquals("No", AppendAndDelete.appendAndDelete("y", "yu", 2));
    }
}
