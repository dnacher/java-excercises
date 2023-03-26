package excercises.beautifulBinaryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Daniel Nacher
 * 2023-03-21
 *
 * Alice has a binary string. She thinks a binary string is beautiful if and only if it doesn't contain the substring .
 *
 * In one step, Alice can change a  to a  or vice versa. Count and print the minimum number of steps needed to make Alice see the string as beautiful.
 *
 * Example
 *
 *
 * She can change any one element and have a beautiful string.
 *
 * Function Description
 *
 * Complete the beautifulBinaryString function in the editor below.
 *
 * beautifulBinaryString has the following parameter(s):
 *
 * string b: a string of binary digits
 * Returns
 *
 * int: the minimum moves required
 * Input Format
 *
 * The first line contains an integer , the length of binary string.
 * The second line contains a single binary string .
 *
 * Constraints
 *
 * .
 * Output Format
 *
 * Print the minimum number of steps needed to make the string beautiful.
 *
 * Sample Input 0
 *
 * STDIN       Function
 * -----       --------
 * 7           length of string n = 7
 * 0101010     b = '0101010'
 * Sample Output 0
 *
 * 2
 * Explanation 0:
 *
 * In this sample,
 *
 * The figure below shows a way to get rid of each instance of :
 *
 * binary.png
 *
 * Make the string beautiful by changing  characters ( and ).
 *
 * Sample Input 1
 *
 * 5
 * 01100
 * Sample Output 1
 *
 * 0
 * Sample Case 1:
 *
 * In this sample
 *
 * Explanation 1
 *
 * The substring  does not occur in , so the string is already beautiful in  moves.
 *
 * Sample Input 2
 *
 * 10
 * 0100101010
 * Sample Output 2
 *
 * 3
 * Explanation 2
 *
 * In this sample
 *
 * One solution is to change the values of  to form a beautiful string.
 */
public class BeautifulBinaryString {

    public static int beautifulBinaryString(String b) {
        // Write your code here
        int total = 0;
        String notGood = "010";
        if(b.length()>=3){
            for(int i=1; i<b.length()-1; i++){
                String subString = b.substring(i-1, i+2);
                if(subString.equals(notGood)){
                    if(i+3<b.length()){
                        if(b.charAt(i+2)=='1'){
                            b = b.substring(0, i+1) + '1' + b.substring(i+2);
                        }else{
                            b = b.substring(0, i) + '0' + b.substring(i+1);
                        }
                    }else{
                        b = b.substring(0, i) + '0' + b.substring(i+1);
                    }

                    total++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String b = bufferedReader.readLine();

        System.out.println(BeautifulBinaryString.beautifulBinaryString(b));

        bufferedReader.close();
    }
}
