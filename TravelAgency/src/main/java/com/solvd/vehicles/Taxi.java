package com.solvd.vehicles;

import com.solvd.travelagency.Client;

public class Taxi extends Vehicle {
    private double fare;
    private boolean isBooked;

    public Taxi() {
    }

    public Taxi(String model, String brand, int identifier, double fare, boolean isBooked) {
        super(model, brand, identifier);
        this.fare = fare;
        this.isBooked = isBooked;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + "Fare: $" + fare;
    }


    @Override
    public void book() {
        setBooked(true);
    }

    @Override
    public void charge(Client client) {
        client.setPackageTotal(client.getPackageTotal() + fare * 2);
    }
}
