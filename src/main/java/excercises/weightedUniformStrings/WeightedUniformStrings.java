package excercises.weightedUniformStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Daniel Nacher
 * 2023-03-21
 */
public class WeightedUniformStrings {

    static List<String> abc = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
        List<String> intermediate = new ArrayList<>();
        List<String> finalString = new ArrayList<>();
        char a_previousChar = ' ';
        String word = "";
        for (int i=0; i<s.length(); i++){
            char a_actualChar = s.charAt(i);
            if(a_previousChar==a_actualChar){
                word+= a_actualChar;
                intermediate.add(word);
            }else {
                word = String.valueOf(s.charAt(i));
                intermediate.add(word);
            }
            a_previousChar = s.charAt(i);
        }
        List<Integer> listInteger = new ArrayList<>();
        for(String str: intermediate){
            listInteger.add(getValues(str));
        }
        createfinalList(listInteger, queries, finalString);
        return finalString;
    }

    public static void createfinalList(List<Integer> listInteger, List<Integer> queries, List<String> finalString){
        for(Integer i: queries){
            if(listInteger.contains(i)){
                finalString.add("Yes");
            }else{
                finalString.add("No");
            }
        }
    }

    public static int getValues(String str){
        int total = 0;
        for(int i=0; i<str.length();i++){
            total+= abc.indexOf(String.valueOf(str.charAt(i)))+1;
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<String> result = WeightedUniformStrings.weightedUniformStrings(s, queries);
        bufferedReader.close();
    }
}
