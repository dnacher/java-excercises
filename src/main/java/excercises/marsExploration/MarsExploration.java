package excercises.marsExploration;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Daniel Nacher
 * 2023-03-14
 *
 * A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.
 *
 * NASA_Mars_Rover.jpg
 *
 * Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of the SOS message have been changed by radiation.
 *
 * Example
 *
 *
 * The original message was SOSSOS. Two of the message's characters were changed in transit.
 *
 * Function Description
 *
 * Complete the marsExploration function in the editor below.
 *
 * marsExploration has the following parameter(s):
 *
 * string s: the string as received on Earth
 * Returns
 *
 * int: the number of letters changed during transmission
 * Input Format
 *
 * There is one line of input: a single string, .
 *
 * Constraints
 *
 *  will contain only uppercase English letters, ascii[A-Z].
 * Sample Input 0
 *
 * SOSSPSSQSSOR
 * Sample Output 0
 *
 * 3
 * Explanation 0
 *
 *  = SOSSPSSQSSOR, and signal length . They sent  SOS messages (i.e.: ).
 *
 * Expected signal: SOSSOSSOSSOS
 * Recieved signal: SOSSPSSQSSOR
 * Difference:          X  X   X
 * Sample Input 1
 *
 * SOSSOT
 * Sample Output 1
 *
 * 1
 * Explanation 1
 *
 *  = SOSSOT, and signal length . They sent  SOS messages (i.e.: ).
 *
 * Expected Signal: SOSSOS
 * Received Signal: SOSSOT
 * Difference:           X
 * Sample Input 2
 *
 * SOSSOSSOS
 * Sample Output 2
 *
 * 0
 * Explanation 2
 *
 * Since no character is altered, return 0.
 */
public class MarsExploration {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        final String SOS = "SOS";
        int total = 0;
        if (s.length() >= 3) {
            List<String> sosList = IntStream.range(0, s.length() / 3)
                    .mapToObj(i -> s.substring(i * 3, (i + 1) * 3))
                    .collect(Collectors.toList());
            total = (int) sosList.stream()
                    .mapToInt(str -> (int) IntStream.range(0, str.length())
                            .filter(i -> str.charAt(i) != SOS.charAt(i))
                            .count())
                    .sum();
        }
        return total;
    }

}
