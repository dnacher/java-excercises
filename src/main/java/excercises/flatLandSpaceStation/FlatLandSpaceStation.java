package excercises.flatLandSpaceStation;

import java.util.Arrays;

/**
 * Daniel Nacher
 * 2024-06-10
 */
public class FlatLandSpaceStation {

    public static int flatlandSpaceStations(int n, int[] c) {
        if(n==c.length) {
            return 0;
        } else {
            Arrays.sort(c);

            int maxDistance = 0;

            // first city index=0 closest to the first station C[0]
            int firstCityToFirstStation = c[0];
            maxDistance = firstCityToFirstStation;

            // n-1 is the last city, c[c.length -1] is the last sation
            int lastCityToLastStation = n - 1 - c[c.length - 1];
            if (lastCityToLastStation > maxDistance) {
                maxDistance = lastCityToLastStation;
            }

            for (int i = 0; i < c.length - 1; i++) {
                //the distance / 2 from 2 consecutive stations will be the longest distance between them.
                int distanceBetweenStations = (c[i + 1] - c[i]) / 2;
                if (distanceBetweenStations > maxDistance) {
                    maxDistance = distanceBetweenStations;
                }
            }

            return maxDistance;
        }
    }
}
