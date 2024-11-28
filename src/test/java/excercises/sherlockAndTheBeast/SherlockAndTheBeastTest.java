package excercises.sherlockAndTheBeast;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-11-18
 */
public class SherlockAndTheBeastTest {

    @Test
    public void test() {
        assertEquals("-1", SherlockAndTheBeast.decentNumber(4));
    }

    @Test
    public void test2() {
        assertEquals("555", SherlockAndTheBeast.decentNumber(3));
    }

    @Test
    public void test3() {
        assertEquals("33333", SherlockAndTheBeast.decentNumber(5));
    }

    @Test
    public void test4() {
        assertEquals("55555533333", SherlockAndTheBeast.decentNumber(11));
    }

    @Test
    public void test5() {
        assertEquals("555555555555555", SherlockAndTheBeast.decentNumber(15));
    }

    @Test
    public void test6() {
        assertEquals("5553333333333", SherlockAndTheBeast.decentNumber(13));
    }
}
