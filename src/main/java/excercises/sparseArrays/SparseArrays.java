package excercises.sparseArrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-11-07
 *
 * There is a collection of input strings and a collection of query strings. For each query string, determine how many
 * times it occurs in the list of input strings. Return an array of the results.
 *
 * Example
 * stringList { 'ab', 'ab', 'abc'}
 * queries { 'ab', 'abc', 'bc' }
 *
 * There are 2 instances of 'ab', 1 of 'abc' and 0 of 'bc'. For each query, add an element to the return array, result {2, 1, 0} .
 *
 *    Complete the function matchingStrings in the editor below. The function must return an array of integers
 *    representing the frequency of occurrence of each query string in stringList.
 *
 *     matchingStrings has the following parameters:
 *     string stringList[n] - an array of strings to search
 *     string queries[q] - an array of query strings
 *
 *     Returns
 *     int[q]: an array of results for each query
 */
public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        List<Integer> finalList = new ArrayList<>();
        queries.forEach(query -> {
            if(stringList.contains(query)) {
                finalList.add(stringList.stream().filter(str -> str.equals(query)).toArray().length);
            } else {
                finalList.add(0);
            }
        });
        return finalList;
    }

}
