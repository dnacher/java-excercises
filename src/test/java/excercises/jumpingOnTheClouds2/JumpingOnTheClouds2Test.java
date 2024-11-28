package excercises.jumpingOnTheClouds2;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-01
 */
public class JumpingOnTheClouds2Test {

    @Test
    public void test() {
        assertEquals(3, JumpingOnTheClouds2.jumpingOnClouds(Arrays.asList(0,1,0,0,0,1,0)));
    }

    @Test
    public void test2() {
        assertEquals(5, JumpingOnTheClouds2.jumpingOnClouds(Arrays.asList(0,1,0,0,1,0,0,1,0)));
    }

    @Test
    public void test3() {
        assertEquals(46, JumpingOnTheClouds2.jumpingOnClouds(Arrays.asList(0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0)));
    }

    @Test
    public void test4() {
        assertEquals(4, JumpingOnTheClouds2.jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0)));
    }

    @Test
    public void test5() {
        assertEquals(3, JumpingOnTheClouds2.jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0)));
    }

    @Test
    public void test6() {
        assertEquals(1, JumpingOnTheClouds2.jumpingOnClouds(Arrays.asList(0, 0)));
    }
}
