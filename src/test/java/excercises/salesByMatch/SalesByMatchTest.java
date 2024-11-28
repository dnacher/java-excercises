package excercises.salesByMatch;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-13
 */
public class SalesByMatchTest {

    @Test
    public void testSockMerchant() {
        // Test case 1: There are no socks
        assertEquals(0, SalesByMatch.sockMerchant(0, Collections.emptyList()));

        // Test case 2: There is only one sock
        assertEquals(0, SalesByMatch.sockMerchant(1, Arrays.asList(1)));

        // Test case 3: There are three socks of different colors
        assertEquals(0, SalesByMatch.sockMerchant(3, Arrays.asList(1, 2, 3)));

        // Test case 4: There are four socks of two different colors
        assertEquals(2, SalesByMatch.sockMerchant(4, Arrays.asList(1, 1, 2, 2)));

        // Test case 5: There are seven socks of four different colors
        assertEquals(3, SalesByMatch.sockMerchant(7, Arrays.asList(1, 2, 3, 4, 1, 2, 3)));
    }
}
