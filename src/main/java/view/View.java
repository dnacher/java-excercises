package view;

import java.util.Scanner;

public abstract class View implements ViewInterface {

    protected String displayMessage;
    Scanner sc = new Scanner(System.in);

    public View(String message) {
        this.displayMessage = message;
    }

    public String getInput() {
        boolean valid = false;
        String value = null;
        while (!valid) {
            System.out.println(this.displayMessage);
            value = sc.nextLine();

            value = value.trim();
            if(value.length() < 1){
                System.out.println("\n*** You must enter a value ***");
                continue;
            }
            break;
        }
        return value; // return name
    }

    public void display() {
        boolean done = false;
        do {
            //prompt for and get player name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return;
            // do the requested action and display next view
            done = this.doAction(value);
        } while (!done); // exit the view when done == true
    }
}
