package excercises.pangram;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-14
 */
public class PangramTest {

    @Test
    public void testPangrams() {
        String pangram1 = "The quick brown fox jumps over the lazy dog";
        String pangram2 = "Pack my box with five dozen liquor jugs";
        String notPangram1 = "This is not a pangram";
        String notPangram2 = "Almost a pangram!";

        assertEquals("pangram", Pangram.pangrams(pangram1));
        assertEquals("pangram", Pangram.pangrams(pangram2));
        assertEquals("not pangram", Pangram.pangrams(notPangram1));
        assertEquals("not pangram", Pangram.pangrams(notPangram2));
    }
}
