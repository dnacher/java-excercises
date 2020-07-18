package Excercises.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    /**
     * -given a n number, the method will print all the fibonacci n numbers
     *  example: 5, the method will print the first 5 numbers of fibonacci
     * -The number must be postive
     * @param number the total number that the method will print.
     */
    public static void fibonacci(int number) {
        List<Integer> fibonacciList = new ArrayList<Integer>();
        int lastNumber = 0;
        int actualNumber = 1;
        int nextNumber;
        fibonacciList.add(lastNumber);
        fibonacciList.add(actualNumber);
        for (int i = 0; i < (number - 2); i++) {
            nextNumber = actualNumber + lastNumber;
            lastNumber = actualNumber;
            actualNumber = nextNumber;
            fibonacciList.add(nextNumber);
        }

        if(fibonacciList.size()<number){
            for (int i = 0; i < fibonacciList.size(); i++) {
                System.out.println((i + 1) + ": " + fibonacciList.get(i));
            }
        }else if(number>0){
            for (int i = 0; i < number; i++) {
                System.out.println((i + 1) + ": " + fibonacciList.get(i));
            }
        }else {
            System.err.println("the number must be positive");
        }

    }
}
