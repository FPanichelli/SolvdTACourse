package com.solvd.places;

import com.solvd.travelagency.Client;
import com.solvd.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApartmentRental extends Accommodation {

    private final static Logger LOGGER = LogManager.getLogger(Runner.class);

    private String adress;
    private boolean hasKitchen;
    private boolean amenities;

    public ApartmentRental() {
    }

    public ApartmentRental(int capacity, boolean hasPrivateBathroom, boolean hasWifi, String adress, boolean hasKitchen, boolean amenities, double nightlyPrice, Destination city) {
        super(capacity, hasPrivateBathroom, hasWifi, city, nightlyPrice);
        this.adress = adress;
        this.hasKitchen = hasKitchen;
        this.amenities = amenities;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean hasKitchen() {
        return hasKitchen;
    }

    public void setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
    }

    public boolean hasAmenities() {
        return amenities;
    }

    public void setAmenities(boolean amenities) {
        this.amenities = amenities;
    }


    @Override
    public String toString() {
        return super.toString() + " Adress: " + adress + " | " + "Has Kitchen: " + hasKitchen + " | "
                + "Amenities: " + amenities + " | " + "Price: $" + super.getNightlyPrice();
    }

    @Override
    public void charge(Client client) {
        client.setPackageTotal(client.getPackageTotal() + super.getNightlyPrice() * client.getTripLength());

    }

    @Override
    public void checkIn(Client client) {
        client.setCheckedInAccommodation(true);
        LOGGER.info("Successfully Checked In Rented Apartment");

    }
}
