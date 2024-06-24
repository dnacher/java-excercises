package excercises.separateTheNumbers;


/**
 * Daniel Nacher
 * 2023-04-04
 *
 * A numeric string, , is beautiful if it can be split into a sequence of two or more positive integers, , satisfying the following conditions:
 *
 *  for any  (i.e., each element in the sequence is  more than the previous element).
 * No  contains a leading zero. For example, we can split  into the sequence , but it is not beautiful because  and  have leading zeroes.
 * The contents of the sequence cannot be rearranged. For example, we can split  into the sequence , but it is not beautiful because it breaks our first constraint (i.e., ).
 * The diagram below depicts some beautiful strings:
 *
 * image
 *
 * Perform  queries where each query consists of some integer string . For each query, print whether or not the string is beautiful on a new line. If it is beautiful, print YES x, where  is the first number of the increasing sequence. If there are multiple such values of , choose the smallest. Otherwise, print NO.
 *
 * Function Description
 *
 * Complete the separateNumbers function in the editor below.
 *
 * separateNumbers has the following parameter:
 *
 * s: an integer value represented as a string
 * Prints
 * - string: Print a string as described above. Return nothing.
 *
 * Input Format
 *
 * The first line contains an integer , the number of strings to evaluate.
 * Each of the next  lines contains an integer string  to query.
 *
 * Constraints
 *
 * Sample Input 0
 *
 * 7
 * 1234
 * 91011
 * 99100
 * 101103
 * 010203
 * 13
 * 1
 * Sample Output 0
 *
 * YES 1
 * YES 9
 * YES 99
 * NO
 * NO
 * NO
 * NO
 * Explanation 0
 *
 * The first three numbers are beautiful (see the diagram above). The remaining numbers are not beautiful:
 *
 * For , all possible splits violate the first and/or second conditions.
 * For , it starts with a zero so all possible splits violate the second condition.
 * For , the only possible split is , which violates the first condition.
 * For , there are no possible splits because  only has one digit.
 * Sample Input 1
 *
 * 4
 * 99910001001
 * 7891011
 * 9899100
 * 999100010001
 * Sample Output 1
 *
 * YES 999
 * YES 7
 * YES 98
 * NO
 */
public class SeparateTheNumbers {

    public static String separateNumbers(String s) {
        int n = s.length();

        for (int length = 1; length <= n / 2; length++) {
            String firstNumberStr = s.substring(0, length);
            long firstNumber = Long.parseLong(firstNumberStr);
            StringBuilder sequence = new StringBuilder(firstNumberStr);

            long nextNumber = firstNumber + 1;
            while (sequence.length() < n) {
                sequence.append(nextNumber);
                nextNumber++;
            }

            if (sequence.toString().equals(s)) {
                return "YES " + firstNumber;
            }
        }

        return "NO";
    }
//        String out = "YES ";
//        int digits = 1;
//        for(int i=0; i<s.length(); i++) {
//            if((i+digits)<=s.length()) {
//                String sub = s.substring(i, i+digits);
//                Integer currentNumber = Integer.valueOf(sub);
//                System.out.println(currentNumber);
//                Integer next = currentNumber + 1;
//                String nextString = String.valueOf(next);
//                if(nextString.length()!=sub.length()) {
//                    digits++;
//                }
//            } else {
//                System.out.println("Termine");
//            }
//        }
//
//        return out;
//        Integer digits = 1;
//        boolean reset = false;
//        String actualNumber = String.valueOf(s.charAt(0));
//        if(s.length()==digits) {
//            return "NO";
//        }
//        for(int i=0; i+digits<s.length()-1; i++) {
//            if(reset) {
//                i = 0;
//                reset = false;
//                actualNumber = s.substring(i, i+digits);
//            }
//            if(s.length()==digits) {
//                return "NO";
//            }
//            int currentNumber = Integer.valueOf(s.substring(i, i+digits));
//            String expectedNext = String.valueOf((currentNumber + 1));
//            int nextNumber;
//            if(expectedNext.length()==digits) {
//                nextNumber = Integer.valueOf(s.substring(i+digits, i+digits+1));
//            } else {
//                nextNumber = Integer.valueOf(s.substring(i+digits, i+digits+2));
//                digits++;
//                reset = true;
//            }
//            if(nextNumber!=Integer.valueOf(expectedNext)) {
//
//            }
//        }
//        out+= actualNumber;
//        return out;


//    private static boolean checkOneDigit(Integer index,int digits, String s) {
//        int currentNumber = Integer.valueOf(String.valueOf(s.charAt(index)));
//        String expectedNext = String.valueOf((currentNumber + 1));
//        int nextNumber= Integer.valueOf(s.substring());
//        if(expectedNext.length()!=String.valueOf(s.charAt(index+1)).length()) {
//            nextNumber = Integer.valueOf(s.substring());
//        } else {
//            nextNumber = Integer.valueOf(String.valueOf(next));
//        }
//        return (currentNumber + 1) == nextNumber;
//    }

//    private static boolean checkMoreThaOneDigit(int index, int digits, String s) {
//        Integer length = index + digits;
//        Integer actualValue = Integer.valueOf(s.substring(index, (index+length)));
//        Integer nextValue = Integer.valueOf(s.substring(length, length+digits));
//        return (actualValue + 1) == nextValue;
//    }





    //            if(digits==1) {
//                if(!checkOneDigit(s.charAt(i), s.charAt(i+1))){
//                    digits++;
//                    actualNumber = s.substring(0, digits);
//                    if(s.length()%digits!=0  || s.length()==digits) {
//                        return "NO";
//                    }
//                    i = 0;
//                }
//            } else {
//                if((i+digits)<s.length()) {
//                    if(!checkMoreThaOneDigit(i, digits, s)) {
//                        digits++;
//                        if(s.length()%digits!=0) {
//                            return "NO";
//                        }
//                        i = 0;
//                    }
//                } else {
//                    return "NO";
//                }
//            }

    //        if(s.length()==1) {
//            return "NO";
//        }else {
//            String out="";
//            boolean firstValue = true;
//            int digit = 1;
//            int index = 0;
//            int nextDigit = 0;
//            while(index+digit<s.length()){
//                int actualValue = Integer.valueOf(s.substring(index, index+digit));
//                index=index+digit;
//                int expectedValue = actualValue+1;
//                nextDigit = String.valueOf((expectedValue)).length();
//                if(index+nextDigit>s.length()){
//                    return "NO";
//                }else{
//                    String actualNextValue = s.substring((index), index+nextDigit);
//                    if(!actualNextValue.equals(String.valueOf(expectedValue))){
//                        digit++;
//                        index = 0;
//                    }else{
//                        if(firstValue){
//                            firstValue = false;
//                            out = "YES " + actualValue;
//                        }
//
//                    }
//                }
//            }
//            return out;
//        }

}
