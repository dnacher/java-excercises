package excercises.fibonacci;

import exceptions.ExcerciseException;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    /**
     * -given a n number, the method will print all the fibonacci n numbers
     *  example: 5, the method will print the first 5 numbers of fibonacci
     * -The number must be postive
     * @param number the total number that the method will print.
     */
    public static List<Integer> fibonacci(int number) throws ExcerciseException {
        List<Integer> fibonacciList = new ArrayList<Integer>();
        int lastNumber = 0;
        int actualNumber = 1;
        int nextNumber;
        fibonacciList.add(lastNumber);
        fibonacciList.add(actualNumber);
        List<Integer> fibonacciFinalList=new ArrayList<>();
        for (int i = 0; i < (number - 2); i++) {
            nextNumber = actualNumber + lastNumber;
            lastNumber = actualNumber;
            actualNumber = nextNumber;
            fibonacciList.add(nextNumber);
        }

        if(fibonacciList.size()<number){
            for (int i = 0; i < fibonacciList.size(); i++) {
                fibonacciFinalList.add(fibonacciList.get(i));
            }
        }else if(number>0){
            for (int i = 0; i < number; i++) {
                fibonacciFinalList.add(fibonacciList.get(i));
            }
        }else {
            throw new ExcerciseException("the number must be positive");
        }
        return fibonacciFinalList;
    }
}
