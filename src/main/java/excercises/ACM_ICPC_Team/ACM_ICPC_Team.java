package excercises.ACM_ICPC_Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Daniel Nacher
 * 2024-07-17
 *
 * There are a number of people who will be attending ACM-ICPC World Finals. Each of them may be well versed in a number
 * of topics. Given a list of topics known by each attendee, presented as binary strings, determine the maximum number
 * of topics a 2-person team can know. Each subject has a column in the binary string, and a '1' means the subject is
 * known while '0' means it is not. Also determine the number of teams that know the maximum number of topics. Return an
 * integer array with two elements. The first is the maximum number of topics known, and the second is the number of
 * teams that know that number of topics.
 *
 * Example:
 * n = 3
 * topics = [10101, 11110, 00010]
 *
 * These are all possible teams that can be formed:
 * Members Subjects
 * (1,2)   [1,2,3,4,5]
 * (1,3)   [1,3,4,5]
 * (2,3)   [1,2,3,4]
 *
 * In this case, the first team will know all 5 subjects. They are the only team that can be created that knows that
 * many subjects, so [5,1] is returned. 5 = max of topics known by the group, 1 = number of groups (only group 1,2)
 */
public class ACM_ICPC_Team {

    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        int i = 0;
        int teams = 0;
        int max = 0;
        while(i+1< topic.size()) {
            for(int j=i+1; j<topic.size(); j++) {
                String first = topic.get(i);
                String second = topic.get(j);
                List<Integer> list1 = getStringValues(first);
                int total = 0;
                for(Integer value: list1) {
                    if(String.valueOf(second.charAt(value)).equals("0")) {
                        total++;
                    }
                }
                total = topic.get(0).length() - total;
                if(total > max) {
                    teams = 0;
                    max = total;
                }

                if(total==max) {
                    teams++;
                }
            }
            i++;
        }
        return Arrays.asList(max, teams);
    }

    private static List<Integer> getStringValues(String str) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals("0")) {
                list.add(i);
            }
        }
        return list;
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int min = -1;
        int max = -1;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; (i+k)<=s.length(); i++) {
            int total = 0;
            String substring = "";
            for(int j=i; j<k+i; j++) {
                total+= checkValue(s.charAt(j));
                substring+= String.valueOf(s.charAt(j));
            }
            System.out.println(substring + " total: " + total);
            if(min!=-1 && total < min) {
                min = total;
                smallest = substring;
            } else if(min==-1){
                min = total;
                smallest = substring;
            }
            if(max!=-1 && total > max) {
                max = total;
                largest = substring;
            } else  if(max==-1){
                max = total;
                largest = substring;
            }
        }
        System.out.println("-------");
        System.out.println(smallest + "\n" + largest);
        return smallest + "\n" + largest;
    }

    private static int checkValue(Character ch) {
        switch(ch) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            case 'H':
                return 8;
            case 'I':
                return 9;
            case 'J':
                return 10;
            case 'K':
                return 11;
            case 'L':
                return 12;
            case 'M':
                return 13;
            case 'N':
                return 14;
            case 'O':
                return 15;
            case 'P':
                return 16;
            case 'Q':
                return 17;
            case 'R':
                return 18;
            case 'S':
                return 19;
            case 'T':
                return 20;
            case 'U':
                return 21;
            case 'V':
                return 22;
            case 'W':
                return 23;
            case 'X':
                return 24;
            case 'Y':
                return 25;
            case 'Z':
                return 26;
            case 'a':
                return 27;
            case 'b':
                return 28;
            case 'c':
                return 29;
            case 'd':
                return 30;
            case 'e':
                return 31;
            case 'f':
                return 32;
            case 'g':
                return 33;
            case 'h':
                return 34;
            case 'i':
                return 35;
            case 'j':
                return 36;
            case 'k':
                return 37;
            case 'l':
                return 38;
            case 'm':
                return 39;
            case 'n':
                return 40;
            case 'o':
                return 41;
            case 'p':
                return 42;
            case 'q':
                return 43;
            case 'r':
                return 44;
            case 's':
                return 45;
            case 't':
                return 46;
            case 'u':
                return 47;
            case 'v':
                return 48;
            case 'w':
                return 49;
            case 'x':
                return 50;
            case 'y':
                return 51;
            case 'z':
                return 52;
            default:
                return 0;
        }
    }
}
