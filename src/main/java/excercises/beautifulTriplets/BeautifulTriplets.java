package excercises.beautifulTriplets;

import java.util.List;

/**
 * Daniel Nacher
 * 2024-07-12
 *
 * Given a sequence of integers a, a triplet (a[i], a[j], a[k]) is beautiful if:
 * i < j < k
 * a[j] - a[i] = a[k] - a[j] = d
 *
 * Given an increasing sequenc of integers and the value of d, count the number of beautiful triplets in the sequence.
 */
public class BeautifulTriplets {

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int i= 0;
        int j = 1;
        int k = 2;
        int count = 0;
        while(k < arr.size()) {
            if(arr.get(j) - arr.get(i) == d && arr.get(k) - arr.get(j) == d) {
                count++;
            }
            k++;
            if(k == arr.size()) {
                j++;
                if(j+1< arr.size()) {
                    k= j+1;
                } else {
                    if(i+2< arr.size()) {
                        i++;
                        j = i+1;
                        k = j+1;
                    }
                }
            }
        }
        return count;
    }

    public static int beautifulTripletsV2(int d, List<Integer> arr) {
        // Write your code here
        int count = 0;
        for(Integer i: arr) {
            if(arr.contains(d + i) && arr.contains(2*d+ i)) {
                count++;
            }
        }
        return count;
    }

    public static void printLine(int i, int j, int k, List<Integer> arr) {
        System.out.print(i + "-");
        System.out.print(j + "-");
        System.out.print(k);
        System.out.print(" - ");
        System.out.print(" valores: ");
        System.out.print(arr.get(i) + "-");
        System.out.print(arr.get(j) + "-");
        System.out.print(arr.get(k));
        System.out.println("");
    }
}
