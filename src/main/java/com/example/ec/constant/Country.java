package com.example.ec.constant;

public enum Country {

    JP(1, "JP"),
    US(2, "US"),
    CN(3, "CN"),
    DE(4, "DE");

    private int code;
    private String name;

    Country(int code, String name) {
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
