package excercises.pangram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Daniel Nacher
 * 2023-03-14
 */
public class Pangram {


    public static String pangrams(String s) {
        // Write your code here
        List<Character> abc = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        Set<Character> ab = new HashSet<>();
        String answer = "";
        s = s.toLowerCase().trim();
        ab = s.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toSet());
        if(ab.size()>=26 && ab.containsAll(abc)){
            return "pangram";
        }else{
            return "not pangram";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             String s = bufferedReader.readLine();
        pangrams(s);
        bufferedReader.close();
    }
}
