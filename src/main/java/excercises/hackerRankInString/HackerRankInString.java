package excercises.hackerRankInString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * Daniel Nacher
 * 2023-03-16
 */
public class HackerRankInString {

    private static String hackerRank = "hackerrank";

    public static String hackerrankInString(String s) {
        // Write your code here
        int index = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==hackerRank.charAt(index)){
                index++;
                if(index==hackerRank.length()){
                    return "YES";
                }
            }
        }
        return (index==hackerRank.length())? "YES": "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                System.out.println(HackerRankInString.hackerrankInString(s));

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

}
