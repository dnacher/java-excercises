package excercises.almostSorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Daniel Nacher
 * 2024-06-25
 */
public class AlmostSorted {

    public static String almostSortedV1(List<Integer> arr) {
        // Write your code here
        StringBuilder response = new StringBuilder();
        List<Integer> arrSorted = new ArrayList<>(arr);
        arrSorted.sort(Comparator.naturalOrder());
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i)!=arrSorted.get(i)) {
                map.put((i+1), arr.get(i));
                count++;
            }
        }
        if(count==2) {
            response.append("swap ");
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                response.append(entry.getKey() + " ");
            }
        } else {
            int numberBefore = -1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                 if(numberBefore== -1) {
                     numberBefore = entry.getValue();
                 } else {
                     int currentValue = entry.getValue();
                     if((numberBefore-1) != (currentValue)) {
                         return "no";
                     } else {
                         numberBefore = entry.getValue();
                     }
                 }
            }
            response.append("reverse ");
            response.append(Collections.min(map.keySet()) + " ");
            response.append(Collections.max(map.keySet()) + " ");
        }
        System.out.println(response.toString().trim());
        return response.toString().trim();
    }

    public static String almostSortedV2(List<Integer> arr) {
        int n = arr.size();
        int left = -1, right = -1;

        // Find the first pair where arr is out of order
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                left = i;
                break;
            }
        }

        // If the array is already sorted
        if (left == -1) {
            return "yes";
        }

        // Find the last pair where arr is out of order
        for (int i = n - 1; i > 0; i--) {
            if (arr.get(i) < arr.get(i - 1)) {
                right = i;
                break;
            }
        }

        // Try swapping the elements at positions left and right
        swap(arr, left, right);
        if (isSorted(arr)) {
            return "yes\nswap " + (left + 1) + " " + (right + 1);
        }
        // If swap didn't work, swap back
        swap(arr, left, right);

        // Try reversing the subarray between left and right
        reverse(arr, left, right);
        if (isSorted(arr)) {
            return "yes\nreverse " + (left + 1) + " " + (right + 1);
        }

        return "no";
    }

    private static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    private static void reverse(List<Integer> arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    private static boolean isSorted(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

}
