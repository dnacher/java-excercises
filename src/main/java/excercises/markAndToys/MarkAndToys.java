package excercises.markAndToys;

import java.util.Collections;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-11-01
 */
public class MarkAndToys {

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        Collections.sort(prices);
        int count  = 0;
        for(int i=0; i<prices.size(); i++) {
            if(prices.get(i)<=k) {
                k-= prices.get(i);
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
