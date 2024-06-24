package excercises.timeWords;

/**
 * Daniel Nacher
 * 2024-06-24
 */
public class TimeWords {

    public static String timeInWords(int h, int m) {
        // Write your code here
        String number = "";
        if(m==0) {
            number = hourToString(h) + "o' clock";
        } else if(m<=30){
            number = numberToString(m) + hourToString(h);
        } else {
            h++;
            number = numberToString(m) + hourToString(h);
        }
        return number.trim();
    }

    private static String hourToString(int h) {
        if(h<10) {
            return number0To9(h);
        } else {
            return number10To29(h);
        }
    }


    private static String numberToString(int n) {
        String number = "";
        if(n==1) {
            number = number0To9(n) + "minute past ";
        } else if(n<10) {
            number = number0To9(n) + "minutes past ";
        } else if(n<30) {
            if(n==15) {
                number = "quarter past ";
            } else {
                number = number10To29(n) + "minutes past ";
            }

        } else if(n==30) {
            number = "half past ";
        } else if(n>30 && n<=59) {
            n = 60 - n;
            if(n>10) {
                if(n==15) {
                    return "quarter to ";
                }
                number = number10To29(n) + "minutes to ";
            } else {
                number = number0To9(n) + "minutes to ";
            }

        }
        return number;
    }

    private static String number0To9(int num) {
        switch (num) {
            case 1:
                return "one ";
            case 2:
                return "two ";
            case 3:
                return "three ";
            case 4:
                return "four ";
            case 5:
                return "five ";
            case 6:
                return "six ";
            case 7:
                return "seven ";
            case 8:
                return "eight ";
            default:
                return "nine ";
        }
    }

    private static String number10To29(int num) {
        String number = "";
        switch (num) {
            case 10:
                return "ten ";
            case 11:
                return "eleven ";
            case 12:
                return "twelve ";
            case 13:
                return "thirteen ";
            case 14:
                return "fourteen ";
            case 15:
                return "fifteen ";
            case 16:
                return "sixteen ";
            case 17:
                return "seventeen ";
            case 18:
                return "eighteen ";
            case 19:
                return "nineteen ";
            default:
                number ="twenty ";
        }
        if(num>20) {
            num = num - 20;
            number+= number0To9(num);
        }
        return number;
    }
}
