package excercises.jumpingOnTheClouds;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-24
 */
public class JumpingOnTheCloudsTest {

    @Test
    public void test() {
        int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
        assertEquals(92, JumpingOnTheClouds.jumpingOnClouds(c, 2));
    }

    @Test
    public void test2() {
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        assertEquals(80, JumpingOnTheClouds.jumpingOnClouds(c, 3));
    }
}
