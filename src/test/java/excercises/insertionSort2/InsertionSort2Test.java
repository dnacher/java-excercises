package excercises.insertionSort2;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Daniel Nacher
 * 2024-07-30
 */
public class InsertionSort2Test {

    @Test
    public void test() {
        InsertionSort2.insertionSort2(6, Arrays.asList(1, 4, 3, 5, 6, 2));
    }

    @Test
    public void test2() {
        InsertionSort2.insertionSort2(8, Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1));
    }
}
