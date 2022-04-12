package com.solvd.travelagency;

import com.solvd.interfaces.IPay;
import com.solvd.interfaces.ITravel;

public class Client extends People implements IPay, ITravel {
    private double budget;
    private String destination;
    private int clientNumber;
    private int tripLength;
    private boolean isCheckedInFlight;
    private boolean isCheckedInAccommodation;
    private boolean isTravelling;
    private double packageTotal;

    public Client(String name, int age, String gender, String nationality, double budget, String destination, int clientNumber, int tripLength, boolean isTravelling) {
        super(name, age, gender, nationality);
        this.budget = budget;
        this.destination = destination;
        this.clientNumber = clientNumber;
        this.tripLength = tripLength;
        this.isCheckedInFlight = false;
        this.isCheckedInAccommodation = false;
        this.isTravelling = false;
    }

    public Client() {
        this.isCheckedInFlight = false;
        this.isCheckedInAccommodation = false;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public int getTripLength() {
        return tripLength;
    }

    public void setTripLength(int tripLength) {
        this.tripLength = tripLength;
    }

    public boolean isCheckedInFlight() {
        return isCheckedInFlight;
    }

    public void setCheckedInFlight(boolean checkedInFlight) {
        isCheckedInFlight = checkedInFlight;
    }

    public boolean isCheckedInAccommodation() {
        return isCheckedInAccommodation;
    }

    public void setCheckedInAccommodation(boolean checkedInAccommodation) {
        isCheckedInAccommodation = checkedInAccommodation;
    }

    public boolean isTravelling() {
        return isTravelling;
    }

    public void setTravelling(boolean travelling) {
        isTravelling = travelling;
    }

    public double getPackageTotal() {
        return packageTotal;
    }

    public void setPackageTotal(double packageTotal) {
        this.packageTotal = packageTotal;
    }

    @Override
    public void pay(double packageTotal, Cashier cashier) {
        cashier.setPayment(packageTotal);
        setBudget(budget - packageTotal);
    }

    @Override
    public void travelling() {
        this.isTravelling = true;

    }


}
