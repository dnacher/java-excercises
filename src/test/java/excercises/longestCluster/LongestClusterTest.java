package excercises.longestCluster;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-18
 */
public class LongestClusterTest {

    @Test
    public void test() {
        int[][] matrix = {  {1,4,2,2},
                            {1,2,4,4},
                            {2,1,1,1},
                            {3,3,3,3}};
        assertEquals(1, LongestCluster.longestCluster(matrix));
    }

    @Test
    public void test2() {
        int[][] matrix = {  {1,4,2,2},
                            {1,2,4,4},
                            {3,4,1,1},
                            {3,4,3,3}};
        assertEquals(4, LongestCluster.longestCluster(matrix));
    }

    @Test
    public void test3() {
        int[][] matrix = {  {1,4,2,2},
                            {1,2,4,4},
                            {1,4,1,1},
                            {3,3,3,3}};
        assertEquals(3, LongestCluster.longestCluster(matrix));
    }

}
