package com.solvd.vehicles;

import com.solvd.travelagency.Client;

public class RentedCar extends Vehicle {
    private double dailyCost;
    private boolean insured;
    private boolean isBooked;

    public RentedCar(String model, String brand, int identifier, double dailyCost, boolean insured) {
        super(model, brand, identifier);
        this.dailyCost = dailyCost;
        this.insured = insured;
        this.isBooked = isBooked;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + "Insurance: " + insured + " | " + "Daily Cost: $" + dailyCost;
    }


    @Override
    public void book() {
        setBooked(true);
    }

    @Override
    public void charge(Client client) {
        client.setPackageTotal(client.getPackageTotal() + dailyCost * client.getTripLength());
    }
}
