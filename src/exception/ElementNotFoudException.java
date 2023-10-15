package exception;

public class ElementNotFoudException extends RuntimeException {
    public ElementNotFoudException() {
    }

    public ElementNotFoudException(String message) {
        super(message);
    }

    public ElementNotFoudException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFoudException(Throwable cause) {
        super(cause);
    }

    public ElementNotFoudException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
