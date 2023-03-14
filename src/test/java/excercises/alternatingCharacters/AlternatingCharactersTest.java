package excercises.alternatingCharacters;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-13
 */
public class AlternatingCharactersTest {

    @Test
    public void testAlternatingCharacters() {
        String s1 = "AAAA";
        String s2 = "BBBBB";
        String s3 = "ABABABAB";
        String s4 = "BABABA";
        String s5 = "AAABBB";

        int result1 = AlternatingCharacters.alternatingCharacters(s1);
        int result2 = AlternatingCharacters.alternatingCharacters(s2);
        int result3 = AlternatingCharacters.alternatingCharacters(s3);
        int result4 = AlternatingCharacters.alternatingCharacters(s4);
        int result5 = AlternatingCharacters.alternatingCharacters(s5);

        assertEquals(3, result1);
        assertEquals(4, result2);
        assertEquals(0, result3);
        assertEquals(0, result4);
        assertEquals(4, result5);
    }
}
