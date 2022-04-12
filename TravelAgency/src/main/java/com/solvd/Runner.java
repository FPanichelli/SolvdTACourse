package com.solvd;

import java.util.*;

import com.solvd.places.*;
import com.solvd.travelagency.*;
import com.solvd.vehicles.*;
import com.solvd.exceptions.*;
import com.solvd.generics.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Runner {
    private final static Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();
        int choice;
        Flight selectedFlight = null;
        Accommodation selectedAccommodation = null;
        RentedCar selectedVehicle = null;
        Taxi selectedTaxi = null;
        Cashier cashier = new Cashier();
        CashRegister cr = new CashRegister();
        Location buenosAires = new Location("America", "Argentina");
        Destination minsk = new Destination("Europe", "Belarus", true, true);

        travelAgency.addFlight("Boeing", "BelarusAirways", 5599, 300, false);
        travelAgency.addFlight("Boeing", "QatarAir", 1238, 550, false);
        travelAgency.addFlight("Boeing", "AerolinasArgentinas", 7206, 200, false);

        travelAgency.addHotelRoom("Premium", 6, true, true, 601, true, true, true, 500, minsk);
        travelAgency.addHotelRoom("Economy", 2, true, true, -101, false, true, true, 300, minsk);

        travelAgency.addApartment("Centric", 2, true, true, "Fake Street 123", true, false, 150, minsk);
        travelAgency.addApartment("Modest", 1, true, false, "1578 Somewhere Blvd", false, false, 50, minsk);
        travelAgency.addApartment("Luxury", 4, true, true, "2020 Pricey Av", true, true, 250, minsk);

        travelAgency.addRentedCar(0, "CLA200", "Mercedez Benz", 55555, 100, true);
        travelAgency.addRentedCar(1, "Focus", "Ford", 15897, 25, true);

        travelAgency.addTaxi("Taxi", "Fiat", 0, 20, false);
        travelAgency.addTaxi("UberX", "Chevrolet", 0, 10, false);

        Client client1 = new Client();
        client1.setClientNumber(01);
        Scanner scClient1 = new Scanner(System.in);
        LOGGER.info("Enter name:");
        client1.setName(scClient1.nextLine());
        LOGGER.info("Enter Budget:");
        client1.setBudget(scClient1.nextDouble());


        LOGGER.info("How many days will you be travelling:");
        client1.setTripLength(scClient1.nextInt());

        LOGGER.info("Hello " + client1.getName() + ".");
        LOGGER.info("Please specify a couple preferences so I can provide you with a budget" + "\n");
        LOGGER.info("-------------------------------------------------------------------------------------");

        do {
            LOGGER.info("Please choose a flight" + "\n");
            LOGGER.info("\n" + "1. " + travelAgency.getFlightList().get(0) + "\n" + "2. " + travelAgency.getFlightList().get(1) + "\n"
                    + "3. " + travelAgency.getFlightList().get(2) + " (With Scales)" + "\n" + "4. Cancel Reservation");
            LOGGER.info("-------------------------------------------------------------------------------------");
            choice = scClient1.nextInt();


            switch (choice) {
                case 1:
                    LOGGER.info("Reserved " + "[ " + travelAgency.getFlightList().get(0) + " ]");
                    selectedFlight = travelAgency.getFlightList().get(0);
                    break;
                case 2:
                    LOGGER.info("Reserved " + "[ " + travelAgency.getFlightList().get(1) + " ]");
                    selectedFlight = travelAgency.getFlightList().get(1);
                    break;
                case 3:
                    LOGGER.info("Reserved: " + "[ " + travelAgency.getFlightList().get(2) + " ]");
                    selectedFlight = travelAgency.getFlightList().get(2);
                    break;
                case 4:
                    throw new OrderCanceled("Order Cancelled");
                default:
                    throw new FlightNotFoundException("Flight Not Found");
            }
            LOGGER.info("-------------------------------------------------------------------------------------");

        } while (choice > 4);

        do {
            LOGGER.info("What kind of accommodation would you like?" + "\n");
            LOGGER.info("\n" + "1. Hotel" + "\n" + "2. Private Accommodation" + "\n" + "3. Cancel Reservation" + "\n" +
                    "-------------------------------------------------------------------------------------");
            choice = scClient1.nextInt();


            switch (choice) {
                case 1:
                    LOGGER.info("Hotel it is");
                    break;
                case 2:
                    LOGGER.info("Private accommodation then");
                    break;
                case 3:
                    throw new OrderCanceled("Order Cancelled");
                default:
                    throw new InvalidSelection("Not an option");
            }
            LOGGER.info("-------------------------------------------------------------------------------------");

        } while (choice > 3);
        if (choice == 1) {
            LOGGER.info("Following hotel rooms are available:");
            LOGGER.info("\n" + "1. " + travelAgency.getRoomList().get("Premium") +
                    "\n" + "2. " + travelAgency.getRoomList().get("Economy") + "\n" + "3. Cancel Reservation");
            LOGGER.info("-------------------------------------------------------------------------------------");

            choice = scClient1.nextInt();

            switch (choice) {
                case 1:
                    LOGGER.info("Reserved " + "[ " + travelAgency.getRoomList().get("Premium") + " ]");
                    selectedAccommodation = travelAgency.getRoomList().get("Premium");
                    break;
                case 2:
                    LOGGER.info("Reserved " + "[ " + travelAgency.getRoomList().get("Economy") + " ]");
                    selectedAccommodation = travelAgency.getRoomList().get("Economy");
                    break;
                case 3:
                    throw new OrderCanceled("Order Cancelled");
                default:
                    throw new HotelRoomNotFound("Hotel room not found");
            }
        } else if (choice == 2) {
            LOGGER.info("Following apartments are available for rent: ");
            LOGGER.info("\n" + "1. " + travelAgency.getApartmentList().get("Centric") + "\n" + "2. " + travelAgency.getApartmentList().get("Modest") + "\n"
                    + "3. " + travelAgency.getApartmentList().get("Luxury") + "\n" + "4. Cancel Reservation");
            LOGGER.info("-------------------------------------------------------------------------------------");

            choice = scClient1.nextInt();

            switch (choice) {
                case 1:
                    LOGGER.info("Reserved " + "[ " + travelAgency.getApartmentList().get("Centric") + " ]");
                    selectedAccommodation = travelAgency.getApartmentList().get("Centric");
                    break;
                case 2:
                    LOGGER.info("Reserved " + "[ " + travelAgency.getApartmentList().get("Modest") + " ]");
                    selectedAccommodation = travelAgency.getApartmentList().get("Modest");
                    break;
                case 3:
                    LOGGER.info("Reserved " + "[ " + travelAgency.getApartmentList().get("Luxury") + " ]");
                    selectedAccommodation = travelAgency.getApartmentList().get("Luxury");
                    break;
                case 4:
                    throw new OrderCanceled("Order Cancelled");
                default:
                    throw new ApartmentRentalNotFound("Apartment not found");
            }
        }
        LOGGER.info("-------------------------------------------------------------------------------------");
        do {
            LOGGER.info("Would you like to rent a car (Pay per day) or Book a cab (One Payment)" + "\n");
            LOGGER.info("\n" + "1. Rent a Car" + "\n" + "2. Take a Cab to and from airport" + "\n" + "3. Cancel Reservation");
            LOGGER.info("-------------------------------------------------------------------------------------");
            choice = scClient1.nextInt();


            switch (choice) {
                case 1:
                    LOGGER.info("1. Rent a car ");

                    break;
                case 2:
                    LOGGER.info("2. Book a cab ");

                    break;
                case 3:
                    throw new OrderCanceled("Order Cancelled");
                default:
                    throw new InvalidSelection("Not an option");
            }
            LOGGER.info("-------------------------------------------------------------------------------------");
        } while (choice > 3);

        if (choice == 1) {
            LOGGER.info("This car models are available:");
            LOGGER.info("\n" + "1. " + travelAgency.getRentedCarList().get(0) + "\n" + "2. " + travelAgency.getRentedCarList().get(1) + "\n" + "3. Cancel Reservation");
            LOGGER.info("-------------------------------------------------------------------------------------");

            choice = scClient1.nextInt();

            switch (choice) {
                case 1:
                    selectedVehicle = travelAgency.getRentedCarList().get(0);
                    break;
                case 2:
                    selectedVehicle = travelAgency.getRentedCarList().get(1);
                    break;

                case 3:
                    throw new OrderCanceled("Order Cancelled");
                default:
                    throw new TransportNotFound("Car not found");
            }
        } else if (choice == 2) {
            LOGGER.info("Options are Taxi or Uber:");
            LOGGER.info("\n" + "1. " + travelAgency.getTaxiByIndex(0, travelAgency.getTaxiList().iterator())
                    + "\n" + "2. " + travelAgency.getTaxiByIndex(1, travelAgency.getTaxiList().iterator())
                    + "\n" + "3. Cancel Reservation");
            LOGGER.info("-------------------------------------------------------------------------------------");

            choice = scClient1.nextInt();

            switch (choice) {
                case 1:
                    selectedTaxi = travelAgency.getTaxiByIndex(0, travelAgency.getTaxiList().iterator());
                    break;
                case 2:
                    selectedTaxi = travelAgency.getTaxiByIndex(1, travelAgency.getTaxiList().iterator());
                    break;

                case 3:
                    throw new OrderCanceled("Order Cancelled");
                default:
                    throw new TransportNotFound("Taxi not found");
            }
        }
        if (selectedVehicle != null) {
            LOGGER.info("Your Package" + "\n" + "Flight: " + selectedFlight
                    + "\n" + "Accommodation: " + selectedAccommodation + "\n" + "Transport: " + selectedVehicle + "\n" + "Total:" + client1.getPackageTotal());
            selectedAccommodation.charge(client1);
            selectedAccommodation.book();
            selectedFlight.charge(client1);
            selectedFlight.book();
            selectedVehicle.charge(client1);
            selectedVehicle.book();
        } else {
            LOGGER.info("Your Package" + "\n" + "Flight: " + selectedFlight
                    + "\n" + "Accommodation: " + selectedAccommodation + "\n" + "Transport: " + selectedTaxi + "\n" + "Total: $" + client1.getPackageTotal());
            selectedAccommodation.charge(client1);
            selectedAccommodation.book();
            selectedFlight.charge(client1);
            selectedFlight.book();
            selectedTaxi.charge(client1);
            selectedTaxi.book();
        }
        PriceGeneric<Double> priceGeneric = new PriceGeneric<>();
        priceGeneric.setData(client1.getPackageTotal());
        LOGGER.info("Your package comes to a total of: $");
        priceGeneric.print();

        LOGGER.info("Proceeding with payment");
        client1.pay(client1.getPackageTotal(), cashier);
        cashier.setPayment(cashier.getPayment());
        cr.takePayment(cashier);

        LOGGER.info("-------------------------------------------------------------------------------------");
        LOGGER.info("Remaining from budget: " + client1.getBudget());
        if (client1.getBudget() < 0) {
            throw new OverBudgetException("Your package is over budget");
        }
        LOGGER.info("-------------------------------------------------------------------------------------");

        LOGGER.info("Would you like to Check in?");
        LOGGER.info("\n" + "1. Yes" + "\n" + "2. No, i'll do it later");

        choice = scClient1.nextInt();
        switch (choice) {
            case 1:
                selectedFlight.checkIn(client1);
                selectedAccommodation.checkIn(client1);
                break;
            case 2:
                LOGGER.info("You will have to check in manually");
                break;
            default:
                throw new InvalidSelection("Not an option");
        }
        LOGGER.info("-------------------------------------------------------------------------------------");
        client1.travelling();
        LOGGER.info("Have a safe flight and enjoy your trip!");

    }
}
