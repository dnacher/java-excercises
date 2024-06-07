package excercises.libraryFine;

/**
 * Daniel Nacher
 * 2024-06-06
 */
public class LibraryFine {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int total = 0;
        int returnDate = d1;
        int returnMonth = m1;
        int returnYear = y1;

        int dueDate = d2;
        int dueMonth = m2;
        int dueYear = y2;

        total = returnYear(returnYear, dueYear);
        if(total>0) {
            return total;
        }
        if(returnYear<dueYear) {
            return 0;
        }
        total = returnMonth(returnMonth, dueMonth);
        if(total>0) {
            return total;
        }
        if(returnMonth<dueMonth) {
            return 0;
        }
        total = returnDays(returnDate, dueDate);

        return total;
    }

    public static int returnYear(int returnYear, int dueYear) {
        if(returnYear> dueYear) {
            return 10000;
        } else {
            return 0;
        }
    }

    public static int returnMonth(int returnMonth, int dueMonth) {
        if(returnMonth > dueMonth) {
            return difference(returnMonth, dueMonth) * 500;
        }else {
            return 0;
        }
    }

    public static int returnDays(int returnDate, int dueDate) {
        if(returnDate > dueDate) {
            return difference(returnDate, dueDate) * 15;
        }else {
            return 0;
        }
    }

    public static int difference(int returnValue, int dueValue) {
        return returnValue - dueValue;
    }
}
