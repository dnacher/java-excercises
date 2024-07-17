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
}
