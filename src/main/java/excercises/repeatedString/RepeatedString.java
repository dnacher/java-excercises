package excercises.repeatedString;

/**
 * Daniel Nacher
 * 2024-07-12
 *
 * There is a string, s, of lowercase English letters that is repeated infinitely many times. Given an integer, n, find
 * and print the number of letter a's in the first n letters of the infinite string.
 * example:
 * s = 'abcac'
 * n = 10
 *
 * The substring we consider is abcacabcac, the first 10 characters of the infinite string. There are 4 occurrences of
 * a in the substring.
 */
public class RepeatedString {

    public static long repeatedString(String s, long n) {
        // Write your code here
        if(s.length()==1) {
            if(String.valueOf(s.charAt(0)).equals("a")) {
                return n;
            } else {
                return 0;
            }
        }
        long subTotal = n/s.length();
        long rest = n%s.length();
        long subcount = 0;
        long count = 0;
        for(int i=0; i<s.length(); i++) {
            if(String.valueOf(s.charAt(i)).equals("a")) {
                count++;
                if(i<rest) {
                    subcount++;
                }
            }
        }
        long total = subTotal * count;
        total+= subcount;
        return total;
    }
}
