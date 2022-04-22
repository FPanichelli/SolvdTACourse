package com.solvd.enums;

public enum EnumHotelRoom {
    PREMIUM(1, "Premium Suite"),
    ECONOMY(2, "Economy Suite");

    private int number;
    private String suite;

    EnumHotelRoom(int number, String suite) {
        this.number = number;
        this.suite = suite;
    }

    public int getNumber() {
        return number;
    }

    public String getSuite() {
        return suite;
    }
}
