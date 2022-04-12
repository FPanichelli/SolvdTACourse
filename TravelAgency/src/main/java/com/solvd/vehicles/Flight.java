package com.solvd.vehicles;

import com.solvd.interfaces.IBook;
import com.solvd.interfaces.ICheckIn;
import com.solvd.travelagency.Client;
import com.solvd.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Flight extends Vehicle implements ICheckIn, IBook {
    private final static Logger LOGGER = LogManager.getLogger(Runner.class);

    private double ticketPrice;
    private boolean isBooked;

    public Flight(String model, String brand, int identifier, double ticketPrice, boolean isBooked) {
        super(model, brand, identifier);
        this.ticketPrice = ticketPrice;
        this.isBooked = isBooked;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + "Price: " + ticketPrice;
    }



    @Override
    public void book() {
        setBooked(true);
    }

    @Override
    public void charge(Client client) {
        client.setPackageTotal(client.getPackageTotal() + ticketPrice);
    }

    @Override
    public void checkIn(Client client) {
        client.setCheckedInFlight(true);
        LOGGER.info("Successfully Checked In Flight");
    }
}