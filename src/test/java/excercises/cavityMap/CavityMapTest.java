package excercises.cavityMap;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-11
 *
 * You are given a square map as a matrix of integer strings. Each cell of the map has a value denoting its depth.
 * We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell
 * adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side, or edge.
 *
 * Find all the cavities on the map and replace their depths with the uppercase character X.
 *
 * Example
 * grid = ['989', '191', '111']
 * return = ['989', '1X1', '111']
 */
public class CavityMapTest {

    @Test
    public void test() {
        assertEquals(Arrays.asList("989", "1X1", "111"), CavityMap.cavityMap(Arrays.asList("989", "191", "111")));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("1112", "1X12", "18X2", "1234"), CavityMap.cavityMap(Arrays.asList("1112", "1912", "1892", "1234")));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList("12", "12"), CavityMap.cavityMap(Arrays.asList("12", "12")));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList("9"), CavityMap.cavityMap(Arrays.asList("9")));
    }
}
