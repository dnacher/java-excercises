package exceptions;

public class ExcerciseException extends Exception {

    public ExcerciseException() {
    }

    public ExcerciseException(String message) {
        super(message);
    }

    public ExcerciseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcerciseException(Throwable cause) {
        super(cause);
    }

    public ExcerciseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
