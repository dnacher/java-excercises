package patternDesign.behavioral.chainOfResponsability;

/**
 * Daniel Nacher
 * 2024-11-28
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
