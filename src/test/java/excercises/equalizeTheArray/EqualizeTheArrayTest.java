package excercises.equalizeTheArray;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-15
 */
public class EqualizeTheArrayTest {

    @Test
    public void test() {
        assertEquals(2, EqualizeTheArray.equalizeArray(Arrays.asList(3,3,2,1,3)));
    }

    @Test
    public void test2() {
        assertEquals(4, EqualizeTheArray.equalizeArray(Arrays.asList(1, 2, 3, 1, 2, 3, 3, 3)));
    }
}
