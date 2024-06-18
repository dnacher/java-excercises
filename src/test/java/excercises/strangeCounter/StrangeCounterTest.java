package excercises.strangeCounter;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-14
 */
public class StrangeCounterTest {

    @Test
    public void test() {
        assertEquals(5, StrangeCounter.strangeCounter(17));
    }

    @Test
    public void test2() {
        assertEquals(649267441662L, StrangeCounter.strangeCounterOptimzed(1000000000000L));
    }


}
