package com.hackhathon.darujemejidlo.exception;

public class UniqueLoginException extends Exception {
    public UniqueLoginException() {
        super();
    }

    public UniqueLoginException(String message) {
        super(message);
    }

    public UniqueLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public UniqueLoginException(Throwable cause) {
        super(cause);
    }

    protected UniqueLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
