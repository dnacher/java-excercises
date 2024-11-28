package excercises.nonDivisibleSubset;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-06
 */
public class NonDivisibleSubsetTest {

    @Test
    public void test() {
        assertEquals(3, NonDivisibleSubset.nonDivisibleSubsetV2(3, Arrays.asList(1, 7, 2, 4)));
    }

    @Test
    public void test2() {
        assertEquals(11, NonDivisibleSubset.nonDivisibleSubsetV2(7, Arrays.asList(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436)));
    }



}
