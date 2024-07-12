package excercises.repeatedString;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-12
 */
public class RepeatedStringTest {

    @Test
    public void test() {
        assertEquals(7, RepeatedString.repeatedString("aba", 10));
    }

    @Test
    public void test2() {
        assertEquals(1000000000000L, RepeatedString.repeatedString("a", 1000000000000L));
    }

    @Test
    public void test3() {
        assertEquals(51574523448L, RepeatedString.repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L));
    }
}
