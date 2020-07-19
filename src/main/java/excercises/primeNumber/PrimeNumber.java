package excercises.primeNumber;

public class PrimeNumber {

    /**
     * the method will print if the number is, or is not a prime number
     * @param number the number to be checked
     */
    public static boolean primeNumber(int number) {
        boolean isPrime = true;
        if (number > 1) {
            int sqnumber = (int) Math.sqrt(number);
            for (int i = 2; i <= sqnumber; i++) {
                if ((number % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (number == 1) {
            isPrime = false;
        }
        return isPrime;
    }
}
