package com.solvd.enums;

public enum EnumTaxis {
    TAXI(1, "Belarus Cab Company car"),
    UBER(2, "UberX Comfort");

    private int number;
    private String company;

    EnumTaxis(int number, String company) {
        this.number = number;
        this.company = company;
    }

    public int getNumber() {
        return number;
    }

    public String getCompany() {
        return company;
    }
}
