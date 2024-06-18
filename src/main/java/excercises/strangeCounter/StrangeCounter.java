package excercises.strangeCounter;

/**
 * Daniel Nacher
 * 2024-06-14
 */
public class StrangeCounter {

    public static long strangeCounter(long t) {
        // Write your code here
        long round = 3;
        long time = 1;
        long endValue = 3;
        long currentValue = 3;
        boolean looking = true;
        while(looking) {
            if(t>=time && t<=time + endValue) {
                while(currentValue > 1) {
                    if(time == t) {
                        return currentValue;
                    } else {
                        time++;
                        currentValue--;
                    }
                }
            } else {
                time = time + (currentValue -1);
            }
            round = round * 2;
            time = time + 1;
            endValue = round;
            currentValue = endValue;
        }
        return currentValue;
    }

    public static long strangeCounterOptimzed(long t) {
        // Write your code here
        long start = 3;
        long time = 1;

        while (t > time + start - 1) {
            time += start;
            start *= 2;
        }

        return start - (t - time);
    }
}
