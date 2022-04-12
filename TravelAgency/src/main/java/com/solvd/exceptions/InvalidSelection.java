package com.solvd.exceptions;

public class InvalidSelection extends RuntimeException {
    public InvalidSelection(String messageSelection) {
        super(messageSelection);
    }
}
