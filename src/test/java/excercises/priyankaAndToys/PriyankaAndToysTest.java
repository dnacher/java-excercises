package excercises.priyankaAndToys;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-11-12
 */
public class PriyankaAndToysTest {

    @Test
    public void test() {
        assertEquals(PriyankaAndToys.toys(Arrays.asList(1, 2, 3, 21, 7, 12, 14, 21)), 4);
    }

    @Test
    public void test2() {
        assertEquals(PriyankaAndToys.toys(Arrays.asList(12, 15, 7, 8, 19, 24)), 4);
    }
}
