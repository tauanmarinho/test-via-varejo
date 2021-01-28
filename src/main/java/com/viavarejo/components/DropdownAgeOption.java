package com.viavarejo.components;

public enum DropdownAgeOption {

    BEGINNING("iniciando-na-area"),
    LAST_THEN_FIVE("menos-de-5-anos"),
    MORE_THEN_FIVE("mais-de-5-anos");

    private String position;

    private DropdownAgeOption(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
