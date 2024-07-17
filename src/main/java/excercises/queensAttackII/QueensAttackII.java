package excercises.queensAttackII;

import java.util.ArrayList;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-07-15
 */
public class QueensAttackII {

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here
        int total = 0;
        r_q--;
        c_q--;
        List<Integer> finalList = flatObstacles(obstacles);
        total+= supEste(n, r_q, c_q, finalList);
        total+= supOeste(n, r_q, c_q, finalList);
        total+= arriba(n, r_q, c_q, finalList);
        total+= abajo(n, r_q, c_q, finalList);
//        total+= supOeste(n, r_q, c_q, finalList);
//        boolean arr[][] = createArray(n);
//        buildArray(arr, obstacles);
//        total+=derecha(n, r_q, c_q, arr);
//        total+=izquierda(n, r_q, c_q, arr);
//        total+=arriba(n,r_q, c_q, arr);
//        total+=abajo(n,r_q,c_q,arr);
//        total+=ne(n,r_q,c_q,arr);
//        total+=nw(n,r_q,c_q,arr);
//        total+=se(n,r_q,c_q,arr);
//        total+=sw(n,r_q,c_q,arr);
        System.out.println(total);
        return total;
    }

    private static int supEste(int n, int r_q, int c_q, List<Integer> obstacle) {
        c_q++;
        int total = 0;
        int up = -1;
        boolean reachUp;
        int down = -1;
        boolean reachDown;

        if(r_q + 1 < n) {
            up = r_q + 1;
            reachUp = false;
        } else {
            reachUp = true;
        }

        if(r_q - 1 > -1) {
            down = r_q - 1;
            reachDown = false;
        } else {
            reachDown = true;
        }

        boolean reachEast;
        if(c_q < n) {
            reachEast = false;
        } else {
            reachEast = true;
        }

        for(int currentColumn=c_q; currentColumn<n; currentColumn++) {
            int e = Integer.valueOf(r_q + "" + currentColumn);
            if(!obstacle.contains(e) && !reachEast) {
                total++;
            } else {
                reachEast = true;
            }
            if(!reachUp) {
                int ne = Integer.valueOf(up + "" + currentColumn);
                if(!obstacle.contains(ne)) {
                    total++;
                    if((up + 1) < n) {
                        up++;
                    } else {
                        reachUp = true;
                    }
                } else {
                    reachUp = true;
                }
            }

            if(!reachDown) {
                int se = Integer.valueOf(down + "" + currentColumn);
                if(!obstacle.contains(se)) {
                    total++;
                    if((down - 1) >= 0) {
                        down--;
                    } else {
                        reachDown = true;
                    }
                } else {
                    reachDown = true;
                }
            }
        }
        return total;
    }

    private static int supOeste(int n, int r_q, int c_q, List<Integer> obstacle) {
        c_q--;
        int total = 0;
        int up = -1;
        boolean reachUp;
        int down = -1;
        boolean reachDown;

        if(r_q + 1 < n) {
            up = r_q + 1;
            reachUp = false;
        } else {
            reachUp = true;
        }

        if(r_q - 1 > -1) {
            down = r_q - 1;
            reachDown = false;
        } else {
            reachDown = true;
        }
        boolean reachWest;
        if(c_q>=0) {
            reachWest = false;
        } else {
            reachWest = true;
        }

        for(int currentColumn=c_q; currentColumn>-1; currentColumn--) {
            int w = Integer.valueOf(r_q + "" + currentColumn);
            if(!obstacle.contains(w) && !reachWest) {
                total++;
            } else {
                reachWest = true;
            }
            if(!reachUp) {
                int ne = Integer.valueOf(up + "" + currentColumn);
                if(!obstacle.contains(ne)) {
                    total++;
                    if((up + 1) < n) {
                        up++;
                    } else {
                        reachUp = true;
                    }
                } else {
                    reachUp = true;
                }
            }

            if(!reachDown) {
                int se = Integer.valueOf(down + "" + currentColumn);
                if(!obstacle.contains(se)) {
                    total++;
                    if((down - 1) >= 0) {
                        down--;
                    } else {
                        reachDown = true;
                    }
                } else {
                    reachDown = true;
                }
            }
        }
        return total;
    }

    private static List<Integer> flatObstacles(List<List<Integer>> obstacles) {
        List<Integer> finalList = new ArrayList<>();
        for(List<Integer> list: obstacles) {
            int j = Integer.valueOf((list.get(0)-1) + "" + (list.get(1)-1));
            finalList.add(j);
        }
        return finalList;
    }

    private static int arriba(int n, int r_q, int c_q, List<Integer> obstacle) {
        int total = 0;
        r_q++;
        for(int currentRow=r_q; currentRow<n; currentRow++) {
            int up = Integer.valueOf(currentRow + "" + c_q);
            if(!obstacle.contains(up)) {
                total++;
            } else {
                break;
            }
        }
        return total;
    }

    private static int abajo(int n, int r_q, int c_q, List<Integer> obstacle) {
        int total = 0;
        r_q--;
        for(int currentRow=r_q; currentRow!=-1; currentRow--) {
            int down = Integer.valueOf(currentRow + "" + c_q);
            if(!obstacle.contains(down)) {
                total++;
            } else {
                break;
            }
        }
        return total;
    }

    private static int izquierda(int n, int r_q, int c_q, boolean arr[][]) {
        int total = 0;
        c_q--;
        for(int i=c_q; i!=-1; i--) {
            if(arr[r_q][i]) {
                break;
            } else {
                total++;
            }
        }
        return total;
    }

    private static int derecha(int n, int r_q, int c_q, boolean arr[][]) {
        int total = 0;
        c_q++;
        for(int i=c_q; i<n; i++) {
            if(arr[r_q][i]) {
                break;
            } else {
                total++;
            }
        }
        return total;
    }

    private static int arriba(int n, int r_q, int c_q, boolean arr[][]) {
        int total = 0;
        r_q++;
        for(int i=r_q; i<n; i++) {
            if(arr[i][c_q]) {
                break;
            } else {
                total++;
            }
        }
        return total;
    }

    private static int abajo(int n, int r_q, int c_q, boolean arr[][]) {
        int total = 0;
        r_q--;
        for(int i=r_q; i!=-1; i--) {
            if(arr[i][c_q]) {
                break;
            } else {
                total++;
            }
        }
        return total;
    }

    private static int ne(int n, int r_q, int c_q, boolean arr[][]) {
        int total = 0;
        r_q++;
        c_q++;
        while (r_q < n && c_q < n) {
            if(!arr[r_q][c_q]) {
                total++;
            }
            r_q++;
            c_q++;
        }
        return total;
    }

    private static int nw(int n, int r_q, int c_q, boolean arr[][]) {
        int total = 0;
        r_q++;
        c_q--;
        while (r_q < n && c_q >= 0) {
            if(!arr[r_q][c_q]) {
                total++;
            }
            r_q++;
            c_q--;
        }
        return total;
    }

    private static int se(int n, int r_q, int c_q, boolean arr[][]) {
        int total = 0;
        r_q--;
        c_q++;
        while (r_q >= 0 && c_q < n) {
            if(!arr[r_q][c_q]) {
                total++;
            }
            r_q--;
            c_q++;
        }
        return total;
    }

    private static int sw(int n, int r_q, int c_q, boolean arr[][]) {
        int total = 0;
        r_q--;
        c_q--;
        while (r_q >= 0 && c_q >= 0) {
            if(!arr[r_q][c_q]) {
                total++;
            }
            r_q--;
            c_q--;
        }
        return total;
    }

    private static boolean[][] createArray (int k) {
        boolean arr[][] = new boolean[k][k];
        return arr;
    }

    private static void buildArray(boolean[][] arr, List<List<Integer>> obstacles) {
        for(List<Integer> list: obstacles) {
            int currentRow = list.get(0) -1;
            int currentColumn = list.get(1) - 1;
            arr[currentRow][currentColumn] = true;
        }
    }

    private static void printArr(boolean arr[][]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print((i+1) + " ");
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j]) {
                    System.out.print(arr[i][j]  + "  - ");
                } else {
                    System.out.print(arr[i][j]  + " - ");
                }

            }
            System.out.println();
        }
        System.out.println("   1        2        3      4       5");
    }

}
