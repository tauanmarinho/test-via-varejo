package com.viavarejo.components;

public enum DropdownFollowingDomainOption {

    CHALLENGE("desafio"),
    SALARY("salario"),
    IM_SO_ANNOYING("sou-mega-chato");

    private String position;

    private DropdownFollowingDomainOption(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
