package excercises.flatLandSpaceStation;

import java.util.Arrays;

/**
 * Daniel Nacher
 * 2024-06-10
 *
 * Flatland is a country with a number of cities, some of which have space stations. Cities are numbered consecutively
 * and each has a road of 1km length connecting it to the next city. It is not a circular route, so the first city doesn't
 * connect with the last city. Determine the maximum distance from any city to its nearest space station.
 *
 * Example
 * n=3
 * c= [1]
 *
 * There are n=3 cities and city 1 has a space station. They occur consecutively along a route. City 0 is 1 - 0 unit
 * away and city 2 is 2 - 1=1 units away. City 1 is 0 units from its nearest space station as one is located there.
 * The maximum distance is 1.
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
