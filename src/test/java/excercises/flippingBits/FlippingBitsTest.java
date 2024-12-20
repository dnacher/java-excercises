package excercises.flippingBits;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-12-20
 */
public class FlippingBitsTest {

    @Test
    public void test() {
        assertEquals(2147483648L, FlippingBits.flippingBits(2147483647L));
    }

    @Test
    public void test2() {
        assertEquals(4294967294L, FlippingBits.flippingBits(1L));
    }

    @Test
    public void test3() {
        assertEquals(4294967295L, FlippingBits.flippingBits(0L));
    }

    @Test
    public void test4() {
        assertEquals(3492223820L, FlippingBits.flippingBits(802743475L));
    }

    @Test
    public void test5() {
        assertEquals(4294967291L, FlippingBits.flippingBits(4L));
    }

    @Test
    public void test6() {
        assertEquals(4294843839L, FlippingBits.flippingBits(123456L));
    }

    @Test
    public void test7() {
        assertEquals(4259365872L, FlippingBits.flippingBits(35601423L));
    }
}
