import view.MainView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MainView mainView = new MainView("Select an option or type Q to exit \n" +
                "A - Fibonacci\n" +
                "B - Palindrome word\n" +
                "C - Prime number\n" +
                "Q - Exit program\n");
        mainView.display();
    }

}
