package excercises.manassaAndStones;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Daniel Nacher
 * 2024-06-11
 */
public class ManasaAndStonesTest {

    @Test
    public void test() {
        assertEquals(Arrays.asList(2, 3, 4), ManasaAndStones.stones(3, 1, 2));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(30, 120, 210, 300), ManasaAndStones.stones(4, 10, 100));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(54, 56, 58, 60, 62, 64, 66), ManasaAndStones.stones(7, 9, 11));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList(24, 32, 40, 48), ManasaAndStones.stones(4, 8, 16));
    }
    
}
