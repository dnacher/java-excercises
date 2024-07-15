package excercises.equalizeTheArray;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Daniel Nacher
 * 2024-07-15
 *
 * Given an array of integers, determine the minimum number of elements to delete to leave only elements of equal value.
 *
 * Example
 * arr = [1,2,2,3]
 *
 * Delete the 2 elements 1 and 3 leaving arr = [2,2]. If both twos plus either the 1 or the 3 are deleted, it takes 3
 * deletions to leave either [3] or [1]. The minimum number of deletions is 2.
 */
public class EqualizeTheArray {

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer value: arr) {
            if(map.containsKey(value)) {
                int val = map.get(value);
                val++;
                map.put(value, val);
            } else {
                map.put(value, 1);
            }
        }
        int max = 0;
        int subtotal = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>max) {
                max = entry.getValue();
            }
            subtotal+= entry.getValue();
        }
        subtotal-= max;
        return subtotal;
    }

}
