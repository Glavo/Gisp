package org.glavo.gini.runtime;

public class NoSuchGiniFieldException extends RuntimeException {
    public NoSuchGiniFieldException() {
    }

    public NoSuchGiniFieldException(String message) {
        super(message);
    }

    public NoSuchGiniFieldException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchGiniFieldException(Throwable cause) {
        super(cause);
    }

    public NoSuchGiniFieldException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
