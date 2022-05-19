package com.hackhathon.darujemejidlo.exception;

public class UniqueUserException extends Exception {
    public UniqueUserException() {
        super();
    }

    public UniqueUserException(String message) {
        super(message);
    }

    public UniqueUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UniqueUserException(Throwable cause) {
        super(cause);
    }

    protected UniqueUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
