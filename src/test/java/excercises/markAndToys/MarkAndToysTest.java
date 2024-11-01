package excercises.markAndToys;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-11-01
 */
public class MarkAndToysTest {

    @Test
    public void test() {
        assertEquals(MarkAndToys.maximumToys(Arrays.asList(1, 12, 5, 111, 200, 1000, 10), 70), 4);
    }

    @Test
    public void test2() {
        assertEquals(MarkAndToys.maximumToys(Arrays.asList(1, 2, 3, 4), 7), 3);
    }

    @Test
    public void test3() {
        assertEquals(MarkAndToys.maximumToys(Arrays.asList(3, 7, 2, 9, 4), 15), 3);
    }
}
