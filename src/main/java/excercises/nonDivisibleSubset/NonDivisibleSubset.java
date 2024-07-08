package excercises.nonDivisibleSubset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Daniel Nacher
 * 2024-07-06
 * <p>
 * Given a set of distinct integers, print the size of a maximal subset of S where the sum of any 2 numbers in S' is not
 * evenly divisible by .k
 * <p>
 * Example
 * S = [19, 10, 12, 10, 24, 25, 22] k = 4
 * <p>
 * <p>
 * One of the arrays that can be created is S'[0]= [10, 12, 25]. Another is S'[1] = [19, 22, 24]. After testing all
 * permutations, the maximum length solution array has 3 elements.
 */

public class NonDivisibleSubset {

    public static int nonDivisibleSubsetV2(int k, List<Integer> s) {
        int[] freq = new int[k];

        // Populate the frequency array with the remainders
        for (int num : s) {
            freq[num % k]++;
        }

        // Start the count with at most one element with a remainder of 0
        int count = Math.min(freq[0], 1);

        // Loop to find the maximum size of the subset
        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) {
                count += Math.max(freq[i], freq[k - i]);
            } else {
                // For the special case when k is even, include at most one element with a remainder of k/2
                count += Math.min(freq[i], 1);
            }
        }

        return count;
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int currenIndex;
        Set<Integer> set = new HashSet<>();
        Set<Integer> check = new HashSet<>();
        Set<Integer> no = new HashSet<>();
        for (int i = 0; i < s.size() - 1; i++) {
            currenIndex = i + 1;
            while (currenIndex < (s.size())) {
                int subTotal = s.get(i) + s.get(currenIndex);
                if (subTotal % k != 0) {
                    set.add(s.get(i));
                } else {
                    if (no.contains(s.get(i))) {
                        check.add(s.get(currenIndex));
                    } else {
                        no.add(s.get(currenIndex));
                    }
                }
                currenIndex++;
            }
        }
        set.addAll(checkValues(set, check, k));
        return set.size();
    }

    public static Set<Integer> checkValues(Set<Integer> set, Set<Integer> check, int k) {
        Set<Integer> finalValue = new HashSet<>();
        for(Integer checkValue: check) {
            boolean isDivisible = false;
            for(Integer setValue: set) {
                int value = checkValue + setValue;
                if(value%k==0) {
                    isDivisible = true;
                    break;
                }
            }
            if(!isDivisible) {
                finalValue.add(checkValue);
            }
        }
        return finalValue;
    }
}


