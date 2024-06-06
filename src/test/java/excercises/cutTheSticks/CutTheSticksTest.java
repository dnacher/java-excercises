package excercises.cutTheSticks;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-06
 */
public class CutTheSticksTest {

    @Test
    public void test2() {
        assertEquals(0, CutTheSticks.cutTheSticks(Arrays.asList(1, 13, 3, 8, 14, 9, 4, 4)));
    }
}
