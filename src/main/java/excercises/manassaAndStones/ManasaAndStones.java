package excercises.manassaAndStones;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Daniel Nacher
 * 2024-06-11
 */
public class ManasaAndStones {

    public static List<Integer> stones(int n, int a, int b) {
        // Write your code here
        TreeSet<Integer> possibleValues = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int value = i * a + (n - 1 - i) * b;
            possibleValues.add(value);
        }

        return new ArrayList<>(possibleValues);
    }
}
