package excercises.twoCharacters;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-13
 */
public class TwoCharactersTest {

    @Test
    public void testAlternate() {
        // Test case 1: input string is empty
        String s1 = "";
        int result1 = TwoCharacters.alternate(s1);
        assertEquals(0, result1);

        // Test case 2: input string contains only one character
        String s2 = "a";
        int result2 = TwoCharacters.alternate(s2);
        assertEquals(0, result2);

        // Test case 3: input string contains two distinct characters
        String s3 = "ab";
        int result3 = TwoCharacters.alternate(s3);
        assertEquals(2, result3);

        // Test case 4: input string contains multiple distinct characters
        String s4 = "abcab";
        int result4 = TwoCharacters.alternate(s4);
        assertEquals(4, result4);

        // Test case 5: input string contains multiple repeating characters
        String s5 = "aabbcc";
        int result5 = TwoCharacters.alternate(s5);
        assertEquals(0, result5);

        // Test case 6: input string contains multiple repeating characters
        String s6 = "beabeefeab";
        int result6 = TwoCharacters.alternate(s6);
        assertEquals(5, result6);

        // Test case 6: input string contains multiple repeating characters
        String s7 = "asdcbsdcagfsdbgdfanfghbsfdab";
        int result7 = TwoCharacters.alternate(s7);
        assertEquals(8, result7);

        // Test case 6: input string contains multiple repeating characters
        String s8 = "asvkugfiugsalddlasguifgukvsa";
        int result8 = TwoCharacters.alternate(s8);
        assertEquals(0, result8);
    }
}
