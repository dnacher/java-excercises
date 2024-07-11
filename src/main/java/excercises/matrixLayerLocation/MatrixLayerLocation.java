package excercises.matrixLayerLocation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Daniel Nacher
 * 2024-07-08
 */
public class MatrixLayerLocation {

    public static String matrixRotation(List<List<Integer>> matrix, int k) {

        if(areAllElementsEqual(matrix)) {
            printList(matrix);
        }
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        boolean[][] visited = new boolean[rows][cols];
        List<List<Integer>> matrixToRotate = new ArrayList<>();
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            List<Integer> finalList = new ArrayList<>();
            // Recorrer desde la izquierda hacia la derecha
            for (int j = left; j <= right; j++) {
                if (!visited[top][j]) {
                    finalList.add(matrix.get(top).get(j));
                    Map<Integer, Integer> mapValue = new HashMap<>();
                    mapValue.put(top, j);
                    map.put(matrix.get(top).get(j), mapValue);
                    visited[top][j] = true;
                }
            }
            top++;

            // Recorrer desde arriba hacia abajo
            for (int i = top; i <= bottom; i++) {
                if (!visited[i][right]) {
                    finalList.add(matrix.get(i).get(right));
                    Map<Integer, Integer> mapValue = new HashMap<>();
                    mapValue.put(i, right);
                    map.put(matrix.get(i).get(right), mapValue);
                    visited[i][right] = true;
                }
            }
            right--;

            // Recorrer desde la derecha hacia la izquierda
            for (int j = right; j >= left; j--) {
                if (bottom >= top && !visited[bottom][j]) {
                    finalList.add(matrix.get(bottom).get(j));
                    Map<Integer, Integer> mapValue = new HashMap<>();
                    mapValue.put(bottom, j);
                    map.put(matrix.get(bottom).get(j), mapValue);
                    visited[bottom][j] = true;
                }
            }
            bottom--;

            // Recorrer desde abajo hacia arriba
            for (int i = bottom; i >= top; i--) {
                if (left <= right && !visited[i][left]) {
                    finalList.add(matrix.get(i).get(left));
                    Map<Integer, Integer> mapValue = new HashMap<>();
                    mapValue.put(i, left);
                    map.put(matrix.get(i).get(left), mapValue);
                    visited[i][left] = true;
                }
            }
            left++;
            matrixToRotate.add(finalList);
        }
        List<List<Integer>> finalMatrixRotated = new ArrayList<>();
        for(List<Integer> matrixValue: matrixToRotate) {
            List<Integer> rotateList = rotateMatrix(matrixValue, k);
            finalMatrixRotated.add(rotateList);
        }

//        printList(matrixToRotate);
//
//        System.out.println("++++++");
//
//        printList(finalMatrixRotated);
//
//        System.out.println("++++++");


        if(!areMatricesEqual(matrixToRotate, finalMatrixRotated)) {
            mapInt(matrixToRotate,finalMatrixRotated,map, matrix.size(), matrix.get(0).size());
        }

        return "";
    }

    public static boolean areAllElementsEqual(List<List<Integer>> matrix) {
        if (matrix.isEmpty() || matrix.get(0).isEmpty()) {
            return true;
        }

        Integer referenceValue = matrix.get(0).get(0);

        for (List<Integer> row : matrix) {
            for (Integer value : row) {
                if (!value.equals(referenceValue)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean areMatricesEqual(List<List<Integer>> matrix1, List<List<Integer>> matrix2) {
        if (matrix1.size() != matrix2.size()) {
            return false;
        }

        for (int i = 0; i < matrix1.size(); i++) {
            List<Integer> row1 = matrix1.get(i);
            List<Integer> row2 = matrix2.get(i);

            if (row1.size() != row2.size()) {
                return false;
            }

            for (int j = 0; j < row1.size(); j++) {
                if (!row1.get(j).equals(row2.get(j))) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printList(List<List<Integer>> list) {
        for(int i=0; i<list.size(); i++) {
            for(int j=0; j<list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }

    private static void mapInt(List<List<Integer>> matrixToRotate, List<List<Integer>> finalMatrixRotated, Map<Integer, Map<Integer, Integer>> map, int m, int n) {
        int[][] arr = new int[m][n];
        for(int i=0; i< finalMatrixRotated.size(); i++) {
            for(int j=0; j< finalMatrixRotated.get(i).size(); j++) {
                int realValue = finalMatrixRotated.get(i).get(j);
                int value = matrixToRotate.get(i).get(j);
                Map<Integer, Integer> coord = map.get(value);
                coord.forEach((v,b) -> arr[v][b] = realValue);
            }
        }
        for(int a=0; a<arr.length; a++) {
            for(int b=0; b<arr[a].length; b++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.println("");
        }
    }

    private static List<Integer> rotateMatrix(List<Integer> finalList, int k) {
        List<Integer> returnList = new ArrayList<>();
        int index = 0;
        if(k==finalList.size()) {
            return finalList;
        }
        while(k>finalList.size()) {
            k = k - finalList.size();
        }
        for(int i=0; i<finalList.size(); i++) {
            if((i+k)<finalList.size()) {
                returnList.add(finalList.get(i+k));
            } else {
                returnList.add(finalList.get(index));
                index++;
            }
        }
        return returnList;
    }

}
