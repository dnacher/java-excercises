package excercises.largestPermutation;

import org.testng.annotations.Test;

import java.util.Arrays;
import static org.testng.Assert.assertEquals;


/**
 * Daniel Nacher
 * 2024-11-18
 */
public class LargestPermutationTest {

    @Test
    public void test() {
        assertEquals(Arrays.asList(5, 2, 3, 4, 1), LargestPermutation.largestPermutation(1, Arrays.asList(4, 2, 3, 5, 1)));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(2, 1), LargestPermutation.largestPermutation(1, Arrays.asList(2, 1)));
    }
}
