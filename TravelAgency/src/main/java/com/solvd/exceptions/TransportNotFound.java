package com.solvd.exceptions;

public class TransportNotFound extends RuntimeException {
    public TransportNotFound(String messageTransport) {
        super(messageTransport);
    }
}
