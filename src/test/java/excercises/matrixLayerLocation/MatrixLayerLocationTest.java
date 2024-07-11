package excercises.matrixLayerLocation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Daniel Nacher
 * 2024-07-08
 */
public class MatrixLayerLocationTest {

    @Test
    public void test() {
        List<Integer> list0 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list1 = Arrays.asList(5, 6, 7, 8);
        List<Integer> list2 = Arrays.asList(9, 10, 11, 12);
        List<Integer> list3 = Arrays.asList(13, 14, 15, 16);
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(list0);
        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);
        assertEquals("", MatrixLayerLocation.matrixRotation(matrix, 2));
    }

    @Test
    public void test2() {
        List<Integer> list0 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list1 = Arrays.asList(7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(13, 14, 15, 16);
        List<Integer> list3 = Arrays.asList(19, 20, 21, 22);
        List<Integer> list4 = Arrays.asList(25, 26, 27, 28);
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(list0);
        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);
        matrix.add(list4);
        assertEquals("", MatrixLayerLocation.matrixRotation(matrix, 7));
    }

    @Test
    public void test3() {
        List<Integer> list0 = Arrays.asList(1, 1);
        List<Integer> list1 = Arrays.asList(1, 1);
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(list0);
        matrix.add(list1);
        assertEquals("", MatrixLayerLocation.matrixRotation(matrix, 3));
    }
}
