package excercises.findDigits;

/**
 * Daniel Nacher
 * 2024-05-17
 */
public class FindDigits {

    /**
    * An integer  is a divisor of an integer  if the remainder of .
     *
     * Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.
     *
     * Example
     * Check whether 1, 2 and 4 are divisors of 124. All 3 numbers divide evenly into 124 so return 3.
     *
     * Check whether 1, 1, and 1 are divisors of 111. All 3 numbers divide evenly into 111 so return 3.
    * */

    public static int findDigits(int n) {
        String s = String.valueOf(n);
        int count = 0;
        for(int i=0; i<s.length(); i++){
            int o =  Character.getNumericValue(s.charAt(i));
            if(o != 0 && n % o == 0) {
                count++;
            }
        }
        return count;
    }
}
