package com.mwangox.stoja;

public class StooException extends RuntimeException{
    public StooException(String message) {
        super(message);
    }

    public StooException(String message, Throwable e) {
        super(message, e);
    }
}
