package excercises.findThePoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-12-24
 *
 * Consider two points, p= (px, py) and q = (qx, qy). We consider the inversion or point reflection, r=(rx, ry), of
 * point p across point q to be a 180° rotation of point p around q.
 */
public class FindThePoint {
    public static List<Integer> findPoint(int px, int py, int qx, int qy) {
        List<Integer> arr = new ArrayList<>();
        int rx;
        int ry;
        if(qx >= px) {
            int dif = qx - px;
            rx = qx + dif;
        } else {
            int dif = px - qx;
            rx = qx - dif;
        }
        if(py >= qy) {
            int dif = py - qy;
            ry = qy - dif;
        } else {
            int dif = qy  - py;
            ry = qy + dif;
        }
        arr.add(rx);
        arr.add(ry);
        return arr;
    }
}
