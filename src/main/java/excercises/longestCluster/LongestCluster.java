package excercises.longestCluster;


/**
 * Daniel Nacher
 * 2024-06-17
 * <p>
 * * Given a 2D array, return the number with longest cluster.
 * * A cluster of the same number adjacent horizontally, vertically, or diagonally.
 * * If the chain is identical return the lower number.
 * * Content of the cells are guaranteed to be positive.
 * * Input:  [[1,4,2,2],
 * *         [1,2,4,4],
 * *         [2,1,1,1],
 * *         [3,3,3,3]]
 * * Output: 1
 * *
 * * Input: {{1,4,2,2},
 * *         {1,2,4,4},
 * *         {3,4,1,1},
 * *         {3,4,3,3}}
 * * Output: 4
 * *
 * * Input: {{1,4,2,2},
 * *         {1,2,4,4},
 * *         {1,4,1,1},
 * *         {3,3,3,3}}
 * * Output: 3
 * <p>
 * <p>
 * List[List[Integer] -> int
 * <p>
 * hor / adj -> i+1 i-1
 * ver i
 */
public class LongestCluster {

    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    public static Integer longestCluster(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int maxClusterSize = 0;
        int resultNumber = Integer.MAX_VALUE;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (!visited[row][col]) {
                    int currentClusterSize = dfs(matrix, visited, row, col, matrix[row][col]);
                    if (currentClusterSize > maxClusterSize) {
                        maxClusterSize = currentClusterSize;
                        resultNumber = matrix[row][col];
                    } else if (currentClusterSize == maxClusterSize && matrix[row][col] < resultNumber) {
                        resultNumber = matrix[row][col];
                    }
                }
            }
        }
        return resultNumber;
    }

    private static int dfs(int[][] matrix, boolean[][] visited, int row, int col, int value) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || visited[row][col] || matrix[row][col] != value) {
            return 0;
        }

        visited[row][col] = true;
        int clusterSize = 1;

        for (int[] direction : DIRECTIONS) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            clusterSize += dfs(matrix, visited, newRow, newCol, value);
        }

        return clusterSize;
    }

}
