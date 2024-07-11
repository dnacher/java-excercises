package excercises.validString;

import java.util.Stack;

/**
 * Daniel Nacher
 * 2024-07-11
 * <p>
 * check if a string is valid or not.
 * to be valid all the parenthesis open need to be closed
 * <p>
 * examples:
 * 1- []{}() this is valid
 * 2- ({()}) this is valid
 * 3- ([)] this is not valid
 */
public class ValidString {

    public static boolean isValidString(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String valueChar = String.valueOf(s.charAt(i));
            if (stack.size() > 0) {
                switch (valueChar) {
                    case "]":
                        if (!stack.peek().equals("[")) {
                            return false;
                        } else {
                            stack.pop();
                            break;
                        }
                    case "}":
                        if (!stack.peek().equals("{")) {
                            return false;
                        } else {
                            stack.pop();
                            break;
                        }
                    case ")":
                        if (!stack.peek().equals("(")) {
                            return false;
                        } else {
                            stack.pop();
                            break;
                        }
                    default:
                        stack.push(valueChar);
                }
            } else {
                stack.push(valueChar);
            }
        }
        return stack.isEmpty();
    }

}
