package excercises.cutTheSticks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Daniel Nacher
 * 2024-06-06
 */
public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> finalList = arr;
        List<Integer> finList = new ArrayList<>();
        finList.add(arr.size());
        while(finalList.size()>0) {
            int min = getMin(finalList);
            List<Integer> inter = new ArrayList<>();
            for(Integer in: finalList) {
                Integer fin = in - min;
                if(fin>0) {
                    inter.add(fin);
                }
            }
            finalList = inter;
            if(inter.size()>0) {
                finList.add(inter.size());
            }
        }
        System.out.println(finList);
        return finList;
    }

    private static Integer getMin(List<Integer> arr) {
        Integer min = arr.stream().sorted().collect(Collectors.toList()).get(0);
        return min;
    }
}
