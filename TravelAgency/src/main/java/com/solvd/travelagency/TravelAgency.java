package com.solvd.travelagency;

import com.solvd.places.ApartmentRental;
import com.solvd.places.Destination;
import com.solvd.places.HotelRoom;
import com.solvd.vehicles.Flight;
import com.solvd.vehicles.RentedCar;
import com.solvd.vehicles.Taxi;

import java.util.*;

public class TravelAgency {

    private ArrayList<Flight> flightList;
    private HashMap<String, ApartmentRental> apartmentList;
    private Hashtable<String, HotelRoom> roomList;
    private LinkedList<RentedCar> rentedCarList;
    private LinkedHashSet<Taxi> taxiList;

    public TravelAgency() {
        this.flightList = new ArrayList<Flight>();
        this.apartmentList = new HashMap<String, ApartmentRental>() {
        };
        this.roomList = new Hashtable<String, HotelRoom>();
        this.rentedCarList = new LinkedList<RentedCar>();
        this.taxiList = new LinkedHashSet<Taxi>();
    }

    public void addFlight(String model, String brand, int identifier, double ticketPrice, boolean isBooked) {
        flightList.add(new Flight(model, brand, identifier, ticketPrice, isBooked));
    }

    public void addApartment(String name, int capacity, boolean hasPrivateBathroom, boolean hasWifi, String adress, boolean hasKitchen, boolean amenities, double nightlyPrice, Destination city) {
        apartmentList.put(name, new ApartmentRental(capacity, hasPrivateBathroom, hasWifi, adress, hasKitchen, amenities, nightlyPrice, city));
    }

    public void addHotelRoom(String name, int capacity, boolean hasPrivateBathroom, boolean hasWifi, int roomNumber, boolean includeMeals, boolean housekeeping, boolean amenities, double nightlyPrice, Destination city) {
        roomList.put(name, new HotelRoom(capacity, hasPrivateBathroom, hasWifi, roomNumber, includeMeals, housekeeping, amenities, nightlyPrice, city));
    }

    public void addRentedCar(int index, String model, String brand, int identifier, double dailyCost, boolean insured) {
        rentedCarList.add(index, new RentedCar(model, brand, identifier, dailyCost, insured));
    }

    public void addTaxi(String model, String brand, int identifier, double fare, boolean isBooked) {
        taxiList.add(new Taxi(model, brand, identifier, fare, isBooked));
    }

    public Taxi getTaxiByIndex(int index, Iterator<Taxi> it) {
        int currIndex = 0;
        Taxi CurrentElement = null;

        while (it.hasNext()) {

            CurrentElement = it.next();

            if (currIndex == index) {

                break;
            }
            CurrentElement = null;

            currIndex++;
        }
        return CurrentElement;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public Hashtable<String, HotelRoom> getRoomList() {
        return roomList;
    }

    public HashMap<String, ApartmentRental> getApartmentList() {
        return apartmentList;
    }

    public LinkedHashSet<Taxi> getTaxiList() {
        return taxiList;
    }

    public LinkedList<RentedCar> getRentedCarList() {
        return rentedCarList;
    }
}
