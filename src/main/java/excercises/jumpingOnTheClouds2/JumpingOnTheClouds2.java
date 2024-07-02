package excercises.jumpingOnTheClouds2;

import java.util.ArrayList;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-07-01
 */
public class JumpingOnTheClouds2 {

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        List<Integer> thunderheads = new ArrayList<>();
        int count = 0;
        for(int i=0; i<c.size(); i++) {
            if(c.get(i)==1) {
                thunderheads.add(i);
            }
        }
        int index = 0;
        int indexThunderheads = 0;
        int nextThunder = -1;
        if(thunderheads.size()>0) {
            nextThunder = thunderheads.get(0);
        }
        while(index < c.size()) {
            if(indexThunderheads<thunderheads.size() && nextThunder!=-1) {
                nextThunder = thunderheads.get(indexThunderheads);
            }
            if(mTcheckThunder(index, 2,nextThunder, false) && (index+2)<c.size()) {
                index+=2;
                count++;
            } else if(mTcheckThunder(index, 2,nextThunder, true) && (index+2)<c.size()) {
                index+=2;
                indexThunderheads++;
                count++;
            } else if(mTcheckThunder(index, 1,nextThunder, false)) {
                index++;
                count++;
            } else if(mTcheckThunder(index, 1,nextThunder, true)) {
                index++;
                indexThunderheads++;
                count++;
            }
        }

        return (count-1);
    }

    private static boolean mTcheckThunder(int index, int increment, int nextThunder, boolean isMt) {
        if(nextThunder==-1) {
            return true;
        }
        if(isMt) {
         return (index + increment) > nextThunder;
        } else {
            return (index + increment) < nextThunder;
        }
    }


}
