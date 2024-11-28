package excercises.halloweenSale;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-12
 */
public class HalloweenSaleTest {

    @Test
    public void test() {
       assertEquals(4,HalloweenSale.howManyGamesV2(20,3,6,70));
    }

    @Test
    public void test2() {
        assertEquals(6,HalloweenSale.howManyGamesV2(20,3,6,80));
    }

    @Test
    public void test3() {
        assertEquals(7,HalloweenSale.howManyGamesV2(20,3,6,85));
    }

    @Test
    public void test4() {
        assertEquals(9917,HalloweenSale.howManyGamesV2(16,2,1,9981));
    }
}
