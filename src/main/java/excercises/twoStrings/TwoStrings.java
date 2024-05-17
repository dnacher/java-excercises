package excercises.twoStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Daniel Nacher
 * 2023-04-18
 *
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 *
 * Example
 *
 *
 * These share the common substring .
 *
 *
 *
 * These do not share a substring.
 *
 * Function Description
 *
 * Complete the function twoStrings in the editor below.
 *
 * twoStrings has the following parameter(s):
 *
 * string s1: a string
 * string s2: another string
 * Returns
 *
 * string: either YES or NO
 * Input Format
 *
 * The first line contains a single integer , the number of test cases.
 *
 * The following  pairs of lines are as follows:
 *
 * The first line contains string .
 * The second line contains string .
 * Constraints
 *
 *  and  consist of characters in the range ascii[a-z].
 * Output Format
 *
 * For each pair of strings, return YES or NO.
 *
 * Sample Input
 *
 * 2
 * hello
 * world
 * hi
 * world
 * Sample Output
 *
 * YES
 * NO
 * Explanation
 *
 * We have  pairs to check:
 *
 * , . The substrings  and  are common to both strings.
 * , .  and  share no common substrings.
 */
public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        // Create a Set to store characters from s1
        Set<Character> set = new HashSet<>();

        // Add all characters from s1 to the Set
        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        // Check if any character from s2 is in the Set
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }

        // No common characters found
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = TwoStrings.twoStrings(s1, s2);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
