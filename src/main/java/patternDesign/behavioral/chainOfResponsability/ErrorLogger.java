package patternDesign.behavioral.chainOfResponsability;

/**
 * Daniel Nacher
 * 2024-11-28
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
