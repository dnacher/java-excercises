package excercises.minimumDistances;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Daniel Nacher
 * 2024-07-02
 *
 * The distance between two array values is the number of indices between them. Given a, find the minimum distance
 * between any pair of equal elements in the array. If no such value exists, return -1.
 */
public class MinimumDistances {

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        Map<Integer, int[]> map = new HashMap<>();
        int minValue = -1;
        for(int i=0; i<a.size(); i++) {
            int value = a.get(i);
            if(map.get(value)!=null) {
                int[] b = map.get(value);
                b[1] = i;
                b[2] = b[1] - b[0];
                map.put(value, b);
                if(minValue==-1) {
                    minValue = b[2];
                } else {
                    if(minValue > b[2]) {
                        minValue = b[2];
                    }
                }
            } else {
                int[] b = new int[3];
                b[0] = i;
                b[2] = -1;
                map.put(value, b);
            }
        }
        return minValue;
    }


}
