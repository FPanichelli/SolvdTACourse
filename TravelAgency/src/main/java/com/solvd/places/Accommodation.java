package com.solvd.places;

import com.solvd.interfaces.IBook;
import com.solvd.interfaces.ICharge;
import com.solvd.interfaces.ICheckIn;

public abstract class Accommodation implements ICharge, ICheckIn, IBook {
    private int capacity;
    private boolean hasPrivateBathroom;
    private boolean hasWifi;
    private Destination city;
    private double nightlyPrice;
    private boolean isBooked;

    public Accommodation() {
    }

    public Accommodation(int capacity, boolean hasPrivateBathroom, boolean hasWifi, Destination city, double nightlyPrice, boolean isBooked) {
        this.capacity = capacity;
        this.hasPrivateBathroom = hasPrivateBathroom;
        this.hasWifi = hasWifi;
        this.city = city;
        this.nightlyPrice = nightlyPrice;
        this.isBooked = isBooked;
    }

    public Accommodation(int capacity, boolean hasPrivateBathroom, boolean hasWifi, Destination city, double nightlyPrice) {
        this.capacity = capacity;
        this.hasPrivateBathroom = hasPrivateBathroom;
        this.hasWifi = hasWifi;
        this.city = city;
        this.nightlyPrice = nightlyPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean hasPrivateBathroom() {
        return hasPrivateBathroom;
    }

    public void setHasPrivateBathroom(boolean hasPrivateBathroom) {
        this.hasPrivateBathroom = hasPrivateBathroom;
    }

    public boolean hasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public Destination getCity() {
        return city;
    }

    public void setCity(Destination city) {
        this.city = city;
    }

    public double getNightlyPrice() {
        return nightlyPrice;
    }

    public void setNightlyPrice(double nightlyPrice) {
        this.nightlyPrice = nightlyPrice;
    }

    public boolean getIsBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return "Fits " + capacity + " People" + " | " + "Has Private Bathroom:" + hasPrivateBathroom
                + " | " + "Has Wifi:" + hasWifi + " | ";
    }

    @Override
    public void book() {
        setBooked(true);
    }
}
