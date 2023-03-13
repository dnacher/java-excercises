package excercises.uruguayanId;

/**
 * Daniel Nacher
 * 2023-01-24
 */
public class UruguayanId {

    public static boolean checkUruguayanId(String str){
        if (str == null || str.isEmpty() || (str.length() != 7 && str.length() != 8)) {
            return false;
        }else if(str.length() == 7){
            str = "0" + str;
        }
        int total = 0;
        int[] cons = {2, 9, 8, 7, 6, 3, 4};
        for (int i = 0; i < str.length() - 1; i++) {
            total += (str.charAt(i) - '0') * cons[i];
        }
        int m = total % 10;
        int finalNum = (m == 0) ? 0 : 10 - m;
        System.out.println(str + "-" + finalNum);
        return finalNum == (str.charAt(str.length() - 1) - '0');
    }
}
