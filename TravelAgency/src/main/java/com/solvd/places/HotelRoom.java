package com.solvd.places;

import com.solvd.travelagency.Client;
import com.solvd.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HotelRoom extends Accommodation {
    private final static Logger LOGGER = LogManager.getLogger(Runner.class);
    private String hotel;
    private int roomNumber;
    private boolean includeMeals;
    private boolean housekeeping;
    private boolean amenities;


    public HotelRoom() {
    }

    public HotelRoom(int capacity, boolean hasPrivateBathroom, boolean hasWifi, String hotel, int roomNumber, boolean includeMeals, boolean housekeeping, boolean amenities, double nightlyPrice, Destination city) {
        super(capacity, hasPrivateBathroom, hasWifi, city, nightlyPrice);
        this.hotel = hotel;
        this.roomNumber = roomNumber;
        this.includeMeals = includeMeals;
        this.housekeeping = housekeeping;
        this.amenities = amenities;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isIncludeMeals() {
        return includeMeals;
    }

    public void setIncludeMeals(boolean includeMeals) {
        this.includeMeals = includeMeals;
    }

    public boolean isHousekeeping() {
        return housekeeping;
    }

    public void setHousekeeping(boolean housekeeping) {
        this.housekeeping = housekeeping;
    }

    public boolean hasAmenities() {
        return amenities;
    }

    public void setAmenities(boolean amenities) {
        this.amenities = amenities;
    }


    @Override
    public String toString() {
        return super.toString() + "Grand Belarus Hotel" + " | " + "Room Number: " + roomNumber + " | " + "Includes Meals: " + includeMeals
                + " | " + "Housekeeping: " + housekeeping + " | " + "Amenities:" + amenities + " | " + "Price: $" + super.getNightlyPrice();
    }

    @Override
    public void charge(Client client) {
        client.setPackageTotal(client.getPackageTotal() + super.getNightlyPrice() * client.getTripLength());

    }

    @Override
    public void checkIn(Client client) {
        client.setCheckedInAccommodation(true);
        LOGGER.info("Successfully Checked In Hotel Room");

    }
}
