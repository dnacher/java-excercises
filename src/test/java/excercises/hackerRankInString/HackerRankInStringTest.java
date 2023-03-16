package excercises.hackerRankInString;

import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

/**
 * Daniel Nacher
 * 2023-03-16
 */
public class HackerRankInStringTest {

    @Test
    void testHackerrankInString() {
        // Test input strings that contain "hackerrank" as a subsequence
        assertTrue(HackerRankInString.hackerrankInString("hhaacckkekraraannk").equals("YES"));
        assertTrue(HackerRankInString.hackerrankInString("rhbaasdncdfsdskgbfefdbrsdfhruyatwrjtcrtnyytktjjt").equals("YES"));
        assertTrue(HackerRankInString.hackerrankInString("hereiamstackerrank").equals("YES"));
        assertTrue(HackerRankInString.hackerrankInString("hhaacckkekraraannk").equals("YES"));

        // Test input strings that do not contain "hackerrank" as a subsequence
        assertTrue(HackerRankInString.hackerrankInString("hackerworld").equals("NO"));
        assertTrue(HackerRankInString.hackerrankInString("hacker").equals("NO"));
        assertTrue(HackerRankInString.hackerrankInString("crank").equals("NO"));
        assertTrue(HackerRankInString.hackerrankInString("hhhhhccccccaaaaakkkkkkeeeeeerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrraaaaaaaaaaaannnnnnnnnnnnnnnnnnnnnnnnnnnnnnkkkkkkkkkkkkkkkkkkkkkkkkkkkk").equals("NO"));
        assertTrue(HackerRankInString.hackerrankInString("hackerworld").equals("NO"));
        assertTrue(HackerRankInString.hackerrankInString("hacker").equals("NO"));
        assertTrue(HackerRankInString.hackerrankInString("crank").equals("NO"));
        assertTrue(HackerRankInString.hackerrankInString("hhhhhccccccaaaaakkkkkkeeeeeerrrrrrrrrrrrrrrrrrrrrnnnnnnnnnnnnkkkkkkkkkk").equals("NO"));
    }
}
