package excercises.superReduceString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Daniel Nacher
 * 2023-03-15
 */
public class SuperReduceString {

    public static String superReducedString(String s) {
        // Write your code here
        int counter = 0;
        while(counter < s.length() ){
            char a = s.charAt(counter);
            if(s.length()-1>counter && a==s.charAt(counter+1) ){
                s = s.substring(0,counter)+s.substring(counter+2);
                counter = 0;
            }else if (s.length()-1==counter) break;
            else  counter++;
        }
        return s.equals("") ? "Empty String":s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        System.out.println(SuperReduceString.superReducedString(s));
        bufferedReader.close();
    }
}
