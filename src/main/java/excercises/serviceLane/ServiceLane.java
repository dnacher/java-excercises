package excercises.serviceLane;

import java.util.ArrayList;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-06-07
 *
 * A driver is driving on the freeway. The check engine light of his vehicle is on, and the driver wants to get service
 * immediately. Luckily, a service lane runs parallel to the highway. It varies in width along its length.
 *
 * You will be given an array of widths at points along the road (indices), then a list of the indices of entry and exit
 * points. Considering each entry and exit point pair, calculate the maximum size vehicle that can travel that segment
 * of the service lane safely.
 *
 * example
 * n=4
 * width = [2, 3, 2, 1]
 * cases = [[1, 2], [2, 4]]
 *
 * If the entry index,i=1  and the exit, j=2, there are two segment widths of 2 and 3 respectively. The widest vehicle that
 * can fit through both is 2. If i=2 and j=4, the widths are [3, 2, 1] which limits vehicle width to 1.
 */
public class ServiceLane {

    public static List<Integer> serviceLane(List<List<Integer>> cases, List<Integer> width) {
        // Write your code here
        List<Integer> finalList = new ArrayList<>();
        for(List<Integer> list: cases) {
            int indexInit = list.get(0);
            int indexEnd = list.get(1);
            int min = -1;
            for(int i=indexInit; i<=indexEnd; i++) {
                if(min==-1) {
                    min = width.get(i);
                }
                if(width.get(i)<min) {
                    min = width.get(i);
                }
            }
            finalList.add(min);
        }
        return finalList;
    }
}
