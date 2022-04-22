package com.solvd.enums;

public enum EnumRentalCars {
    MERCEDEZ(1,"Mercedez Benz CLA-200"),
    FORD(2,"Ford Focus");


    private int number;
    private String model;

    EnumRentalCars(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }
}
