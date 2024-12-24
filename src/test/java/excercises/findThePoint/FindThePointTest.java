package excercises.findThePoint;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-12-24
 */
public class FindThePointTest {

    @Test
    public void test() {
        assertEquals(FindThePoint.findPoint(1, 1 ,2, 2),Arrays.asList(3, 3));
    }

    @Test
    public void test2() {
        assertEquals(FindThePoint.findPoint(4, 3, 5, 2), Arrays.asList(6, 1));
    }

    @Test
    public void test3() {
        assertEquals(FindThePoint.findPoint(2, 4, 5, 6), Arrays.asList(8, 8));
    }

    @Test
    public void test4() {
        assertEquals(FindThePoint.findPoint(1, 2, 2, 2), Arrays.asList(3, 2));
    }

    @Test
    public void test5() {
        assertEquals(FindThePoint.findPoint(1, 1, 1, 1), Arrays.asList(1, 1));
    }

    @Test
    public void test6() {
        assertEquals(FindThePoint.findPoint(1, 2, 2, 1), Arrays.asList(3, 0));
    }

    @Test
    public void test7() {
        assertEquals(FindThePoint.findPoint(1, 8, 7, 8), Arrays.asList(13, 8));
    }

    @Test
    public void test8() {
        assertEquals(FindThePoint.findPoint(9, 1, 1, 1), Arrays.asList(-7, 1));
    }

    @Test
    public void test9() {
        assertEquals(FindThePoint.findPoint(8, 4, 3, 2), Arrays.asList(-2, 0));
    }

    @Test
    public void test10() {
        assertEquals(FindThePoint.findPoint(7, 8, 9, 1), Arrays.asList(11, -6));
    }

}
