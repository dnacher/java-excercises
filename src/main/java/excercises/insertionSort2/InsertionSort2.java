package excercises.insertionSort2;

import java.util.Collections;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-07-30
 */
public class InsertionSort2 {

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for(int i=2; i<=n; i++) {
            List<Integer> list = arr.subList(0, i);
            Collections.sort(list);
            for(int j=0; j<n; j++) {
                if(j==0) {
                    System.out.print(list.get(j));
                } else {
                    if(j<i) {
                        System.out.print(" " + list.get(j));
                    } else {
                        System.out.print(" " + arr.get(j));
                    }
                }
            }
            System.out.println();
        }
    }
}
