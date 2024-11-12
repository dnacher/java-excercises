package excercises.priyankaAndToys;

import java.util.Collections;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-11-12
 */
public class PriyankaAndToys {

    public static int toys(List<Integer> w) {
        Collections.sort(w);
        // Write your code here
        int containerCount = 1;
        int minValue = w.get(0);
        for(int i=1; i< w.size(); i++) {
            int total = w.get(i) - minValue;
            if(total>4) {
                containerCount++;
                minValue = w.get(i);
            }
        }
        return containerCount;
    }
}
