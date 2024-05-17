package excercises.separateTheNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * Daniel Nacher
 * 2023-04-04
 *
 * A numeric string, , is beautiful if it can be split into a sequence of two or more positive integers, , satisfying the following conditions:
 *
 *  for any  (i.e., each element in the sequence is  more than the previous element).
 * No  contains a leading zero. For example, we can split  into the sequence , but it is not beautiful because  and  have leading zeroes.
 * The contents of the sequence cannot be rearranged. For example, we can split  into the sequence , but it is not beautiful because it breaks our first constraint (i.e., ).
 * The diagram below depicts some beautiful strings:
 *
 * image
 *
 * Perform  queries where each query consists of some integer string . For each query, print whether or not the string is beautiful on a new line. If it is beautiful, print YES x, where  is the first number of the increasing sequence. If there are multiple such values of , choose the smallest. Otherwise, print NO.
 *
 * Function Description
 *
 * Complete the separateNumbers function in the editor below.
 *
 * separateNumbers has the following parameter:
 *
 * s: an integer value represented as a string
 * Prints
 * - string: Print a string as described above. Return nothing.
 *
 * Input Format
 *
 * The first line contains an integer , the number of strings to evaluate.
 * Each of the next  lines contains an integer string  to query.
 *
 * Constraints
 *
 * Sample Input 0
 *
 * 7
 * 1234
 * 91011
 * 99100
 * 101103
 * 010203
 * 13
 * 1
 * Sample Output 0
 *
 * YES 1
 * YES 9
 * YES 99
 * NO
 * NO
 * NO
 * NO
 * Explanation 0
 *
 * The first three numbers are beautiful (see the diagram above). The remaining numbers are not beautiful:
 *
 * For , all possible splits violate the first and/or second conditions.
 * For , it starts with a zero so all possible splits violate the second condition.
 * For , the only possible split is , which violates the first condition.
 * For , there are no possible splits because  only has one digit.
 * Sample Input 1
 *
 * 4
 * 99910001001
 * 7891011
 * 9899100
 * 999100010001
 * Sample Output 1
 *
 * YES 999
 * YES 7
 * YES 98
 * NO
 */
public class SeparateTheNumbers {

    public static void separateNumbers(String s) {
        // Write your code here
        System.out.println(test(s));
    }

    public static String test(String s) {
        if(s.length()==1) {
            return "NO";
        }else {
            String out="";
            boolean firstValue = true;
            int digit = 1;
            int index = 0;
            int nextDigit = 0;
            while(index+digit<s.length()){
                int actualValue = Integer.valueOf(s.substring(index, index+digit));
                index=index+digit;
                int expectedValue = actualValue+1;
                nextDigit = String.valueOf((expectedValue)).length();
                if(index+nextDigit>s.length()){
                    return "NO";
                }else{
                    String actualNextValue = s.substring((index), index+nextDigit);
                    if(!actualNextValue.equals(String.valueOf(expectedValue))){
                        digit++;
                        index = 0;
                    }else{
                        if(firstValue){
                            firstValue = false;
                            out = "YES " + actualValue;
                        }

                    }
                }
            }
            return out;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                SeparateTheNumbers.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}