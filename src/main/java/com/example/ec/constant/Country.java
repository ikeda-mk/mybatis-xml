package com.example.ec.constant;

public enum Country {

    JP(1, "JP"),
    US(2, "US"),
    CN(3, "CN"),
    DE(4, "DE");

    private final int code;
    private final String name;

    Country(int code, String name) {
        this.code = code;
        this.name = name;
    }


    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
