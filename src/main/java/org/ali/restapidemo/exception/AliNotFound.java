package org.ali.restapidemo.exception;

public class AliNotFound extends RuntimeException{
    private final String message;

    public AliNotFound(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
