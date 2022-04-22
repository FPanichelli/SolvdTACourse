package com.solvd.enums;

public enum EnumFlights {
    BELARUS_AIRWAYS(1, "Belarus Airways"),
    QATAR_AIR(2, "Qatar Air"),
    AEROLINEAS_ARGENTINAS(3, "Aerolineas Argentinas");

    private int number;
    private String airline;

    EnumFlights(int number, String airline) {
        this.number = number;
        this.airline = airline;
    }

    public int getNumber() {
        return number;
    }

    public String getAirline() {
        return airline;
    }
}
