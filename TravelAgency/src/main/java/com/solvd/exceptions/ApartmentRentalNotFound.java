package com.solvd.exceptions;

public class ApartmentRentalNotFound extends RuntimeException {
    public ApartmentRentalNotFound(String messageApartment) {
        super(messageApartment);
    }
}
