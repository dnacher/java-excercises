package excercises.salesByMatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


import static java.util.stream.Collectors.toList;

/**
 * Daniel Nacher
 * 2023-03-13
 *
 * There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 *
 * Example
 *
 *
 * There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
 *
 * Function Description
 *
 * Complete the sockMerchant function in the editor below.
 *
 * sockMerchant has the following parameter(s):
 *
 * int n: the number of socks in the pile
 * int ar[n]: the colors of each sock
 * Returns
 *
 * int: the number of pairs
 * Input Format
 *
 * The first line contains an integer , the number of socks represented in .
 * The second line contains  space-separated integers, , the colors of the socks in the pile.
 *
 * Constraints
 *
 *  where
 * Sample Input
 *
 * STDIN                       Function
 * -----                       --------
 * 9                           n = 9
 * 10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
 * Sample Output
 *
 * 3
 *
 */
public class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */


    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;
        ar.forEach(item ->{
            if(!map.isEmpty()){
                if(map.get(item)!=null){
                    map.put(item, map.get(item) + 1);
                }else{
                    map.put(item, 1);
                }
            }else{
                map.put(item, 1);
            }
        });
        return map.values().stream().mapToInt(value -> value/2).sum();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = SalesByMatch.sockMerchant(n, ar);
        System.out.println(result);

        bufferedReader.close();
    }

}
