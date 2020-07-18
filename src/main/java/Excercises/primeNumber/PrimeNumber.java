package Excercises.primeNumber;

public class PrimeNumber {

    /**
     * the method will print if the number is, or is not a prime number
     * @param number the number to be checked
     */
    public static void primeNumber(int number) {
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
        System.out.print(number);
        if (isPrime) {
            System.out.println(" is a prime number" );
        }else{
            System.out.println(" is NOT a prime number" );
        }
    }
}
