package excercises.superReduceString;

import excercises.twoCharacters.TwoCharacters;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2023-03-16
 */
public class SuperReduceStringTest {

    @Test
    public void testAlternate() {
        // Test case 1: input string is empty
        String s1 = "";
        String result1 = SuperReduceString.superReducedString(s1);
        assertEquals("Empty String", result1);

        String s2 = "aa";
        String result2 = SuperReduceString.superReducedString(s2);
        assertEquals("Empty String", result2);

        String s3 = "baab";
        String result3 = SuperReduceString.superReducedString(s3);
        assertEquals("Empty String", result3);

        String s4 = "aaabccddd";
        String result4 = SuperReduceString.superReducedString(s4);
        assertEquals("abd", result4);

        String s5 = "asdkjwewhhheasdsb";
        String result5 = SuperReduceString.superReducedString(s5);
        assertEquals("asdkjwewheasdsb", result5);

        String s6 = "cvzxczxczxczxczcasdadarwtretrefghfgbvccvbvxcvczv";
        String result6 = SuperReduceString.superReducedString(s6);
        assertEquals("cvzxczxczxczxczcasdadarwtretrefghfgvxcvczv", result6);

        String s7 = "sdfsdfsdfsdfsdcxvxcvxcvsdfsdf";
        String result7 = SuperReduceString.superReducedString(s7);
        assertEquals("sdfsdfsdfsdfsdcxvxcvxcvsdfsdf", result7);

    }
}
