package com.solvd.exceptions;

public class FlightNotFoundException extends RuntimeException {
    public FlightNotFoundException(String messageFlight) {
        super(messageFlight);
    }
}
