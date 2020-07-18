package Excercises.palindromeWord;

public class PalindromeWord {

    /**
     * the method will return true if the word given is palindrome
     * a palindrome word is a word where you can read it backwords and forward the same
     * example: ABBA is a palindrome word
     * @param word
     * @return
     */
    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            char b = word.charAt((word.length() - 1) - i);
            if (a != b) {
                return false;
            }
        }
        return true;
    }
}
