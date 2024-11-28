package patternDesign.behavioral.interpreter;

/**
 * Daniel Nacher
 * 2024-11-28
 *
 * Interpreter pattern provides way to evaluate language grammar or expression. This type of pattern comes under
 * behavioral patterns. This pattern involves implementing a expression interface which tells to interpret a particular
 * context. This pattern is used in SQL parsing, symbol processing engine etc.
 *
 * Implementation
 *
 * We're going to create an interface Expression and concrete classes implementing the Expression interface. A class
 * TerminalExpression is defined which acts as a main interpreter of context in question. Other classes OrExpression,
 * AndExpression are used to create combinational expressions.
 *
 * InterpreterPatternDemo, our demo class will use Expression class to create rules and demonstrate
 * parsing of expressions.
 */
public class InterpreterDemo {
    //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
