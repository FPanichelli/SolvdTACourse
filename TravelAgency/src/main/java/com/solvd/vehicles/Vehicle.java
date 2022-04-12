package com.solvd.vehicles;

import com.solvd.interfaces.IBook;
import com.solvd.interfaces.ICharge;
import com.solvd.travelagency.Client;

public abstract class Vehicle implements ICharge, IBook {
    private String model;
    private String brand;
    private int identifier;

    public Vehicle() {
    }

    public Vehicle(String model, String brand, int identifier) {
        this.model = model;
        this.brand = brand;
        this.identifier = identifier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }


    @Override
    public String toString() {
        return brand + " | " + model + " | " + "ID:" + identifier;
    }

}