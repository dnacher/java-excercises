package excercises.fairRations;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-11
 */
public class FairRationsTest {

    @Test
    public void test() {
        assertEquals("4", FairRations.fairRations(Arrays.asList(2, 3, 4, 5, 6)));
    }

    @Test
    public void test2() {
        assertEquals("NO", FairRations.fairRations(Arrays.asList(1, 2)));
    }
}
