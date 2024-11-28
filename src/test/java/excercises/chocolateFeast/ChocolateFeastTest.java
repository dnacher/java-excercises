package excercises.chocolateFeast;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-05
 */
public class ChocolateFeastTest {

    @Test
    public void test() {
        assertEquals(6, ChocolateFeast.chocolateFeast(10, 2 , 5));
    }

    @Test
    public void test2() {
        assertEquals(3, ChocolateFeast.chocolateFeast(12, 4 , 4));
    }

    @Test
    public void test3() {
        assertEquals(5, ChocolateFeast.chocolateFeast(6, 2 , 2));
    }

    @Test
    public void test4() {
        assertEquals(3, ChocolateFeast.chocolateFeast(7, 3 , 2));
    }
}
