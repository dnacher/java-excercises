package excercises.fibonacci;

import exceptions.ExcerciseException;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Daniel Nacher
 * 2023-03-13
 * This test covers several scenarios:
 *
 * Test with valid input and expected output.
 * Test with input of 1 and expected output.
 * Test with input of 2 and expected output.
 * Test with input of 0 and expected exception.
 * Test with negative input and expected exception.
 */
public class FibonacciTest {

    @Test
    public void testFibonacci() throws ExcerciseException {
        // Test with valid input
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8);
        assertEquals(expected, Fibonacci.fibonacci(7));

        // Test with input of 1
        expected = Arrays.asList(0);
        assertEquals(expected, Fibonacci.fibonacci(1));

        // Test with input of 2
        expected = Arrays.asList(0, 1);
        assertEquals(expected, Fibonacci.fibonacci(2));

        // Test with input of 0
        assertThrows(ExcerciseException.class, () -> Fibonacci.fibonacci(0));

        // Test with negative input
        assertThrows(ExcerciseException.class, () -> Fibonacci.fibonacci(-5));
    }
}
