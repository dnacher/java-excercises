package excercises.flatLandSpaceStation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-10
 */
public class FlatLandSpaceStationTest {

    @Test
    public void test() {
        int[] c = {0, 4};
        assertEquals(2, FlatLandSpaceStation.flatlandSpaceStations(5, c));
    }

    @Test
    public void test2() {
        int[] c = {0, 1 ,2, 3, 4, 5, 6};
        assertEquals(0, FlatLandSpaceStation.flatlandSpaceStations(6, c));
    }
}
