package excercises.beautifulTriplets;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-12
 */
public class BeautifulTripletsTest {

    @Test
    public void test() {
        assertEquals(3, BeautifulTriplets.beautifulTripletsV2(3, Arrays.asList(1, 2, 4, 5, 7, 8, 10)));
    }

    @Test
    public void test2() {
        assertEquals(2,BeautifulTriplets.beautifulTripletsV2(3, Arrays.asList(1, 6, 7, 7, 8, 10, 12, 13, 14, 19)));
    }


}
