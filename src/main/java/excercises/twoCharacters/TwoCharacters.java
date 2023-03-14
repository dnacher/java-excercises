package excercises.twoCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Daniel Nacher
 * 2023-03-01
 */
public class TwoCharacters {

    public static int alternate(String s) {
        // Write your code here
        Map<Character,Integer> m = new HashMap<>();
        int max = 0;
        s.chars().forEach(c -> m.put((char)c, m.getOrDefault((char)c, 0)+1));
        //keys
        List<Character> ks = new ArrayList<>(m.keySet());

        int kn = ks.size();
        for(int i = 0; i < kn - 1; i++){
            for(int j = i+1; j < kn; j++) {
                char x1 = ks.get(i);
                char x2 = ks.get(j);
                String re = s.replaceAll("[^" + x1 + "|" + x2 + "]", "");
                //check for alternate
                if(checkForAlternate(re)){
                    //go through list and
                    int sum = ks.stream().filter(c -> (char)c == x1 || (char)c == x2).mapToInt(c -> m.get(c)).sum();
                    max = Math.max(sum,max);
                }
            }
        }
        return max;
    }

    private static boolean checkForAlternate(String re) {
        if (re.length() <= 1) {
            return false;
        }
        char firstChar = re.charAt(0);
        for (int i = 1; i < re.length(); i++) {
            if (re.charAt(i) == firstChar) {
                return false;
            }
            firstChar = re.charAt(i);
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = TwoCharacters.alternate(s);
        System.out.println("result: " + result);

        bufferedReader.close();
    }
}
