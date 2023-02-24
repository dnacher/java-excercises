package excercises.camelCase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Daniel Nacher
 * 2023-02-24
 *
 * There is a sequence of words in CamelCase as a string of letters, , having the following properties:
 *
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given , determine the number of words in .
 *
 * Example
 *
 * There are  words in the string: 'one', 'Two', 'Three'.
 *
 * Function Description
 *
 * Complete the camelcase function in the editor below.
 *
 * camelcase has the following parameter(s):
 *
 * string s: the string to analyze
 * Returns
 *
 * int: the number of words in
 * Input Format
 *
 * A single line containing string .
 *
 * Constraints
 *
 * Sample Input
 *
 * saveChangesInTheEditor
 * Sample Output
 *
 * 5
 * Explanation
 *
 * String  contains five words:
 *
 * save
 * Changes
 * In
 * The
 * Editor
 *
 */
public class CamelCase {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int camelcase(String s) {
        // Write your code here
        int count = 1;
        for(int i=0; i< s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = CamelCase.camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
