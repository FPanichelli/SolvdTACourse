package com.solvd.travelagency;


public class Cashier extends Staff {
    private boolean isChargingClients;
    private double payment;

    public Cashier(String name, int age, String gender, String nationality, double salary, char desk, boolean isChargingClients, double payment) {
        super(name, age, gender, nationality, salary, desk);
        this.isChargingClients = isChargingClients;
        this.payment = payment;
    }

    public Cashier() {
        super();
    }

    public void payToRegister(double payment, CashRegister cr) {
        cr.setRegisterTotal(getPayment() + payment);
    }

    public boolean isChargingClients() {
        return isChargingClients;
    }

    public void setChargingClients(boolean chargingClients) {
        isChargingClients = chargingClients;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

}

