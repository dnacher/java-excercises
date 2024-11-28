package patternDesign.behavioral.chainOfResponsability;

/**
 * Daniel Nacher
 * 2024-11-28
 *
 * Chain of Responsibility Pattern
 * As the name suggest, the chain of responsibility pattern creates a chain of receiver objects for a request.
 * This pattern decouples sender and receiver of a request based on type of request. This pattern comes under
 * behavioral patterns.
 *
 * In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle
 * the request then it passes the same to the next receiver and so on.
 *
 * Implementation
 *
 * We've created an abstract class AbstractLogger with a level of logging. Then we've created three types of loggers
 * extending the AbstractLogger. Each logger checks the level of message to its level and print accordingly otherwise
 * does not print and pass the message to its next logger.
 */
public class ChainOfResponsibilityDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
