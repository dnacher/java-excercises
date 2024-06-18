package excercises.caesarCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * Daniel Nacher
 * 2023-03-15
 * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each
 * letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of
 * the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 *
 * Original alphabet:      abcdefghijklmnopqrstuvwxyz
 * Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
 * Example
 *
 *
 * The alphabet is rotated by , matching the mapping above. The encrypted string is .
 *
 * Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.
 *
 * Function Description
 *
 * Complete the caesarCipher function in the editor below.
 *
 * caesarCipher has the following parameter(s):
 *
 * string s: cleartext
 * int k: the alphabet rotation factor
 * Returns
 *
 * string: the encrypted string
 * Input Format
 *
 * The first line contains the integer, , the length of the unencrypted string.
 * The second line contains the unencrypted string, .
 * The third line contains , the number of letters to rotate the alphabet by.
 *
 * Constraints
 *
 *
 *
 *  is a valid ASCII string without any spaces.
 *
 * Sample Input
 *
 * 11
 * middle-Outz
 * 2
 * Sample Output
 *
 * okffng-Qwvb
 * Explanation
 *
 * Original alphabet:      abcdefghijklmnopqrstuvwxyz
 * Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab
 *
 * m -> o
 * i -> k
 * d -> f
 * d -> f
 * l -> n
 * e -> g
 * -    -
 * O -> Q
 * u -> w
 * t -> v
 * z -> b
 */
public class CaesarCipher {

    static List<Character> alphabet = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

    public static String caesarCipher(String s, int k) {
        // Write your code here
        String cipherString = "";
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            int index = alphabet.indexOf(Character.toLowerCase(c));
            if(index>=0){
                if(k>25){
                    k = k%26;
                }
                int cipherIndex = index + k;
                if(cipherIndex>25){
                    cipherIndex = cipherIndex-26;
                }
                if(Character.isUpperCase(c)){
                    cipherString+= String.valueOf(alphabet.get(cipherIndex)).toUpperCase();
                }else{
                    cipherString+= String.valueOf(alphabet.get(cipherIndex));
                }
            }else{
                cipherString+= s.charAt(i);
            }
        }
        return cipherString;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(CaesarCipher.caesarCipher(s, k));

        bufferedReader.close();
    }
}
