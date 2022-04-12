package com.solvd.exceptions;

public class HotelRoomNotFound extends RuntimeException {
    public HotelRoomNotFound(String messageHotelRoom) {
        super(messageHotelRoom);
    }
}
