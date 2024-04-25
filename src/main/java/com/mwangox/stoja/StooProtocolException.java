package com.mwangox.stoja;

import lombok.Getter;

/**Exception that will be thrown when there is communication issue with StooKV server. */
@Getter
public class StooProtocolException extends RuntimeException{

    private final String status;
    private final String description;

    public StooProtocolException(String status, String description){
        super(description);
        this.description = description;
        this.status = status;
    }
}
