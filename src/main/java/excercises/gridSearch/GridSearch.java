package excercises.gridSearch;

import java.util.List;

/**
 * Daniel Nacher
 * 2024-06-12
 */
public class GridSearch {

    public static String gridSearch(List<String> G, List<String> P) {
        int rowsG = G.size();
        int colsG = G.get(0).length();
        int rowsP = P.size();
        int colsP = P.get(0).length();

        // Loop through each position in the grid where the top-left of the pattern could fit
        for (int i = 0; i <= rowsG - rowsP; i++) {
            for (int j = 0; j <= colsG - colsP; j++) {
                boolean found = true;

                // Check if the pattern matches starting at position (i, j)
                for (int k = 0; k < rowsP; k++) {
                    if (!G.get(i + k).substring(j, j + colsP).equals(P.get(k))) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

//    public static String gridSearch(List<String> G, List<String> P) {
//        // Write your code here
//        String result = "NO";
//        for (String patLine : P) {
//            for (int j = 0; j < G.size(); j++) {
//                if (G.get(j).contains(patLine)) {
//                    String gridLine = G.get(j);
//                    for (int i = 0; i < gridLine.length() - patLine.length(); i++) {
//                        //encontre el pattern en el grid
//                        if ((patLine.length() + i) < gridLine.length()) {
//                            if (patLine.equals(gridLine.substring(i, i + patLine.length()))) {
//                                int indexPattern = P.indexOf(patLine);
//                                int positionGrid = i;
//                                int indexGrid = j;
//                                String check = checkGrid(indexPattern, positionGrid, indexGrid, G, P);
//                                if(check.equals("YES")){
//                                    return check;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return result;
//    }
//
//    private static String checkGrid(int indexPattern, int positionGrid, int indexGrid, List<String> G, List<String> P) {
//        String result = "NO";
//        if ((indexPattern + 1) > P.size() || (indexGrid + 1) > G.size()) {
//            return result;
//        }
//        int count = 0;
//        for (int i = indexPattern + 1; i < P.size(); i++) {
//            String patLine = P.get(i);
//            for (int h= indexGrid + 1; h < G.size(); h++) {
//                String gridLine = G.get(h);
//                String subString = gridLine.substring(positionGrid, positionGrid + patLine.length());
//                if (patLine.equals(subString)) {
//                    count++;||
//                }
//            }
//
//        }
//
//        return count==(P.size()-1) ? "YES" : "NO";
//    }

}
