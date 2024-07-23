package excercises.taumandBDay;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-22
 */
public class TaumandBDayTest {

    @Test
    public void test() {
        assertEquals(20, TaumandBDay.taumBday(10,10,1,1,1));
    }

    @Test
    public void test2() {
        assertEquals(37, TaumandBDay.taumBday(5,9,2,3,4));
    }

    @Test
    public void test3() {
        assertEquals(12, TaumandBDay.taumBday(3,6,9,1,1));
    }

    @Test
    public void test4() {
        assertEquals(35, TaumandBDay.taumBday(7,7,4,2,1));
    }

    @Test
    public void test5() {
        assertEquals(12, TaumandBDay.taumBday(3,3,1,9,2));
    }

    @Test
    public void test6() {
        assertEquals(29, TaumandBDay.taumBday(3,5,3,4,1));
    }

    @Test
    public void test7() {
        assertEquals(18192035842L, TaumandBDay.taumBday(27984,1402,619246,615589,247954));
    }

    @Test
    public void test8() {
        assertEquals(20582630747L, TaumandBDay.taumBday(95677,39394,86983,311224,588538));
    }

}
