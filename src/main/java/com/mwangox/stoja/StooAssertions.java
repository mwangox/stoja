package com.mwangox.stoja;

public class StooAssertions {

    private StooAssertions(){}
    public static void shouldNotBeNullOrEmpty(Object object, String message){
        if(object == null || object == "") {
            throw new StooException(message);
        }
    }

    public static void shouldNotBeNull(Object object, String message){
        if(object == null) {
            throw new StooException(message);
        }
    }
}
