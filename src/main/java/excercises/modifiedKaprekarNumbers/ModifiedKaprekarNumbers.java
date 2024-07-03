package excercises.modifiedKaprekarNumbers;

/**
 * Daniel Nacher
 * 2024-07-02
 */
public class ModifiedKaprekarNumbers {

    public static String kaprekarNumbers(int p, int q) {
        // Write your code here
        String response = "";
        for(int i=p; i<=q; i++) {
            int digits = String.valueOf(i).length();
            long square = (long) i * i;
            String stringSquare = String.valueOf(square);
            int length = stringSquare.length();
            int l;
            int r;
            if(length>1) {
                l = Integer.valueOf(stringSquare.substring(0, length - digits));
                r = Integer.valueOf(stringSquare.substring(length - digits, length));
            } else {
                l = 0;
                r = length;
            }
            if(l+r == i) {
                response += i + " ";
            }
        }
        return response.trim();
    }
}
