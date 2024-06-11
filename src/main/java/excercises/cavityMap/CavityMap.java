package excercises.cavityMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-06-11
 */
public class CavityMap {

    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        if (grid.size() == 1) {
            return new ArrayList<>(grid);
        }
        List<String> finalMap = new ArrayList<>();
        finalMap.add(grid.get(0));
        for(int i=1; i<grid.size()-1; i++) {
            String value = grid.get(i);
            String line = String.valueOf(value.charAt(0));
            for(int j=1; j<value.length()-1; j++) {
                int center = convertToInt(value.charAt(j));
                int i1 = convertToInt(value.charAt(j-1));
                int i2 = convertToInt(value.charAt(j+1));
                String previousValue = grid.get(i-1);
                int i3 = convertToInt(previousValue.charAt(j));
                String nextValue = grid.get(i+1);
                int i4 = convertToInt(nextValue.charAt(j));
                if(checkDepth(center, i1, i2, i3, i4)) {
                    line+= "X";
                } else {
                    line+= center + "";
                }
            }
            line+= String.valueOf(value.charAt(value.length()-1));
            finalMap.add(line);
        }
        finalMap.add(grid.get(grid.size()-1));
        return finalMap;
    }

    private static int convertToInt(Character c) {
        return Integer.valueOf(String.valueOf(c));
    }

    private static boolean checkDepth(int center, int i1, int i2, int i3, int i4) {
        return center > i1 && center > i2 && center > i3 && center > i4;
    }
}
