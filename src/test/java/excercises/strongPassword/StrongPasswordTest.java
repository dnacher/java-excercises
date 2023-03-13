package excercises.strongPassword;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-13
 */
public class StrongPasswordTest {

    @Test
    public void testMinimumNumber() {
        assertEquals(3, StrongPassword.minimumNumber(4, "abcd"));
        assertEquals(3, StrongPassword.minimumNumber(6, "abcdef"));
        assertEquals(0, StrongPassword.minimumNumber(10, "abc123DEF!"));
        assertEquals(3, StrongPassword.minimumNumber(5, "abcde"));
        assertEquals(3, StrongPassword.minimumNumber(5, "ABCDE"));
        assertEquals(3, StrongPassword.minimumNumber(5, "12345"));
        assertEquals(3, StrongPassword.minimumNumber(5, "!@#$%"));
    }
}
