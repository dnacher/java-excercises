package excercises.hourglass;

import java.util.List;

/**
 * Daniel Nacher
 * 2024-07-30
 */
public class Hourglass {

    public static int hourglass(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;
        for(int i= 0; i<arr.size()-2; i++){
            for(int j=0; j<arr.get(i).size()-2; j++){
                int subTotal = 0;
                int second = i+1;
                int bottom = i+2;
                int right = j+1;
                int finalRight = j+2;
                subTotal+= arr.get(i).get(j);
                subTotal+= arr.get(i).get(right);
                subTotal+= arr.get(i).get(finalRight);
                subTotal+= arr.get(second).get(right);
                subTotal+= arr.get(bottom).get(j);
                subTotal+= arr.get(bottom).get(right);
                subTotal+= arr.get(bottom).get(finalRight);
                if(subTotal>max) {
                    max = subTotal;
                }
            }
        }
        return max;
    }
}
