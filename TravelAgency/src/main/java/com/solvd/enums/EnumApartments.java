package com.solvd.enums;

public enum EnumApartments {
    CENTRIC(1, "Centric Apartment"),
    MODEST(2, "Modest Apartment"),
    LUXURY(3, "Luxurious Apartment");


    private int number;
    private String name;

    EnumApartments(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
