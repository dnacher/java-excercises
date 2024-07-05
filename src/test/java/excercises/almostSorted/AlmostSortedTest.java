package excercises.almostSorted;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


/**
 * Daniel Nacher
 * 2024-06-25
 */
public class AlmostSortedTest {

    @Test
    public void test() {
        assertEquals("reverse 2 5", AlmostSorted.almostSortedV1(Arrays.asList(1, 5, 4, 3, 2, 6)));
    }

    @Test
    public void test2() {
        assertEquals("swap 1 2", AlmostSorted.almostSortedV1(Arrays.asList(4,  2)));
    }

    @Test
    public void test3() {
        assertEquals("swap 2 5", AlmostSorted.almostSortedV1(Arrays.asList(1, 5, 3, 4, 2, 6)));
    }

    @Test
    public void test4() {
        assertEquals("no", AlmostSorted.almostSortedV1(Arrays.asList(3, 1, 2)));
    }

    @Test
    public void test5() {
        assertEquals("swap 3 9", AlmostSorted.almostSortedV1(Arrays.asList(2,4,4523,11,77,128,509,3000,9, 56768))); }
}
