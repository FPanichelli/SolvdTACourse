package com.solvd.travelagency;

public class CashRegister {
    private double registerTotal;

    public CashRegister(double registerTotal) {
        this.registerTotal = registerTotal;
    }

    public CashRegister() {

    }

    public double getRegisterTotal() {
        return registerTotal;
    }

    public void setRegisterTotal(double registerTotal) {
        this.registerTotal = registerTotal;
    }
    public void takePayment(Cashier cashier) {
        setRegisterTotal(getRegisterTotal() + cashier.getPayment());
        cashier.setPayment(0);
    }
}
