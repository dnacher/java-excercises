package excercises.strongPassword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Daniel Nacher
 * 2023-02-24
 *
 * Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:
 *
 * Its length is at least .
 * It contains at least one digit.
 * It contains at least one lowercase English character.
 * It contains at least one uppercase English character.
 * It contains at least one special character. The special characters are: !@#$%^&*()-+
 * She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?
 *
 * Note: Here's the set of types of characters in a form you can paste in your solution:
 *
 * numbers = "0123456789"
 * lower_case = "abcdefghijklmnopqrstuvwxyz"
 * upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 * special_characters = "!@#$%^&*()-+"
 * Example
 *
 *
 * This password is 5 characters long and is missing an uppercase and a special character. The minimum number of characters to add is .
 *
 *
 * This password is 5 characters long and has at least one of each character type. The minimum number of characters to add is .
 *
 * Function Description
 *
 * Complete the minimumNumber function in the editor below.
 *
 * minimumNumber has the following parameters:
 *
 * int n: the length of the password
 * string password: the password to test
 * Returns
 *
 * int: the minimum number of characters to add
 * Input Format
 *
 * The first line contains an integer , the length of the password.
 *
 * The second line contains the password string. Each character is either a lowercase/uppercase English alphabet, a digit, or a special character.
 *
 * Constraints
 *
 * All characters in  are in [a-z], [A-Z], [0-9], or [!@#$%^&*()-+ ].
 * Sample Input 0
 *
 * 3
 * Ab1
 * Sample Output 0
 *
 * 3
 * Explanation 0
 *
 * She can make the password strong by adding  characters, for example, $hk, turning the password into Ab1$hk which is strong.
 *
 *  characters aren't enough since the length must be at least .
 *
 * Sample Input 1
 *
 * 11
 * #HackerRank
 * Sample Output 1
 *
 * 1
 * Explanation 1
 *
 * The password isn't strong, but she can make it strong by adding a single digit.
 */
public class StrongPassword {

    public final static String nums = "1234567890";
    public final static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    public final static String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public final static String special_characters = "!@#$%^&*()-+";

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int countLowerCase = 0;
        int countUpperCase = 0;
        int countSpecialCharacter = 0;
        int countnum = 0;
        int total = 0;
        for(int i=0; i<password.length(); i++){
            String s = String.valueOf(password.charAt(i));
            if(lowerCase.contains(s)){
                countLowerCase++;
            }
            if(upper_case.contains(s)){
                countUpperCase++;
            }
            if(nums.contains(s)){
                countnum++;
            }
            if(special_characters.contains(s)){
                countSpecialCharacter++;
            }
        }
        if(countLowerCase==0){
            total++;
        }
        if(countUpperCase==0){
            total++;
        }
        if(countnum==0){
            total++;
        }
        if(countSpecialCharacter==0){
            total++;
        }
        int dif = 6 -n;
        if(n>=6){
            return total;
        }else{
            return (total>dif) ? total : dif;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = StrongPassword.minimumNumber(n, password);
        System.out.println(answer);

        bufferedReader.close();
    }
}
