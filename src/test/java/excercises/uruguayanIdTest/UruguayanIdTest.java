package excercises.uruguayanIdTest;

import excercises.uruguayanId.UruguayanId;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Daniel Nacher
 * 2023-03-13
 */
public class UruguayanIdTest {

    @Test
    public void testValidUruguayanId() {
        assertTrue(UruguayanId.checkUruguayanId("18369329"));
    }

    @Test
    public void testInvalidUruguayanId() {
        assertFalse(UruguayanId.checkUruguayanId("1836932-7"));
    }

    @Test
    public void testInvalidFormat() {
        assertFalse(UruguayanId.checkUruguayanId(""));
        assertFalse(UruguayanId.checkUruguayanId(null));
        assertFalse(UruguayanId.checkUruguayanId("18369326"));
        assertFalse(UruguayanId.checkUruguayanId("01836932-6"));
        assertFalse(UruguayanId.checkUruguayanId("183693-6"));
        assertFalse(UruguayanId.checkUruguayanId("18369321-6"));
    }
}
