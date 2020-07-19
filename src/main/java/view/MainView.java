package view;

import exceptions.ExcerciseException;
import excercises.fibonacci.Fibonacci;
import excercises.palindromeNumber.PalindromeNumber;
import excercises.palindromeWord.PalindromeWord;
import excercises.primeNumber.PrimeNumber;

import java.util.List;
import java.util.Scanner;

public class MainView  extends View{

    public MainView(String message) {
        super(message);
    }

    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        boolean answer=false;
        switch (menuOption) {
            case "A":
                this.fibonacci();
                break;
            case "B":
                this.palindrome();
                break;
            case "C":
                this.primeNumber();
                break;
            case "D":
                this.palindromeNumber();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return answer;
    }

    public void fibonacci(){
        System.out.println("please type a number to print this number of fibonacci array");
        Scanner sc2 = new Scanner(System.in);
        int number= sc2.nextInt();
        try {
            for(Integer i: Fibonacci.fibonacci(number)){
                System.out.println(i);
            }
        }catch (ExcerciseException e){
            System.out.println(e.getMessage());
        }
    }

    public void palindrome(){
        System.out.println("please type a word to check if the word is a palindrome word");
        Scanner sc2 = new Scanner(System.in);
        String word= sc2.nextLine();
        if(PalindromeWord.isPalindrome(word)){
            System.out.println(word + " is a palindrome word");
        }else{
            System.out.println(word + " is NOT a palindrome word");
        }
        System.out.println("");
    }

    public void primeNumber(){
        System.out.println("please type a number to check if is prime or not");
        Scanner sc2 = new Scanner(System.in);
        int number= sc2.nextInt();
        if(PrimeNumber.primeNumber(number)){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is NOT a prime number");
        }
    }

    public void palindromeNumber(){
        System.out.println("please type a number to check if is palindrome or not");
        Scanner sc2 = new Scanner(System.in);
        int number= sc2.nextInt();
        if(PalindromeNumber.palindromeNumber(number)){
            System.out.println(number + " is a palindrome number");
        }else{
            System.out.println(number + " is NOT a palindrome number");
        }
        System.out.println("");
    }
}
