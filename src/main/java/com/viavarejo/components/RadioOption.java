package com.viavarejo.components;

public enum RadioOption {

    FIRST("0"),
    SECOND("1"),
    THIRD("2"),
    FOURTH("3"),
    FIFTH("4");

    private String position;

    private RadioOption(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
