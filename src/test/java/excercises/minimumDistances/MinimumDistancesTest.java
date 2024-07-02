package excercises.minimumDistances;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-02
 *
 */
public class MinimumDistancesTest {

    @Test
    public void test() {
        assertEquals(3, MinimumDistances.minimumDistances(Arrays.asList(7,1,3,4,1,7)));
    }

    @Test
    public void test2() {
        assertEquals(2, MinimumDistances.minimumDistances(Arrays.asList(3, 2, 1, 2, 3)));
    }

    @Test
    public void test3() {
        assertEquals(-1, MinimumDistances.minimumDistances(Arrays.asList(1, 2, 3, 4, 10)));
    }


}
