package excercises.happyLadybugs;

import java.util.HashMap;
import java.util.Map;

/**
 * Daniel Nacher
 * 2024-06-13
 */
public class HappyLadybugs {

    public static String happyLadybugs(String b) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<b.length(); i++) {
            String charB = String.valueOf(b.charAt(i));
            int count = map.get(charB)==null? 0 : map.get(charB);
            count++;
            map.put(charB, count);

        }
        boolean canChange = false;
        if (isAlreadyHappy(b)) {
            return "YES";
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()==b.length() && b.length()>1) {
                return "YES";
            }
            if(entry.getKey().equals("_")) {
                canChange = true;
            }
            if(entry.getValue()<2 && !entry.getKey().equals("_")) {
                return "NO";
            }
        }
        return canChange ? "YES" : "NO";

    }

    private static boolean isAlreadyHappy(String b) {
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != '_') {
                if ((i > 0 && b.charAt(i) == b.charAt(i - 1)) ||
                        (i < b.length() - 1 && b.charAt(i) == b.charAt(i + 1))) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
