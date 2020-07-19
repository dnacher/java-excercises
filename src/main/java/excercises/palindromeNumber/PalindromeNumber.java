package excercises.palindromeNumber;

public class PalindromeNumber {

    public static boolean palindromeNumber(int number){
        int palindrome = number;
        int reverse = 0;

        //on the reverse, the while statement will reverse the number
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }
}
