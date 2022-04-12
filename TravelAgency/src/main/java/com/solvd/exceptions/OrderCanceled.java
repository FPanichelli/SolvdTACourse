package com.solvd.exceptions;

public class OrderCanceled extends RuntimeException {
    public OrderCanceled(String messageSelection) {
        super(messageSelection);
    }
}
