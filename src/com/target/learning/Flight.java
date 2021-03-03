package com.target.learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Flight {
    private int passengers;
    private Integer flightNumber;
    private int totalCheckedBags;
    private Character flightClass;
    private boolean[] isSeatAvailable;
    private int maxCarryOns;
    private int totalCarryOns;

    int getSeats() {return 150;}

    public Flight() {
        this.maxCarryOns = getSeats() * 2;
        this.isSeatAvailable = new boolean[getSeats()];
        for(int i = 0; i < getSeats(); ++i) {
            this.isSeatAvailable[i] = true;
        }

    }

    public Flight(int flightNumber) {
        this.maxCarryOns = getSeats() * 2;
        this.isSeatAvailable = new boolean[getSeats()];

        for(int i = 0; i < getSeats(); ++i) {
            this.isSeatAvailable[i] = true;
        }

        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.maxCarryOns = getSeats() * 2;
        this.isSeatAvailable = new boolean[getSeats()];

        for(int i = 0; i < getSeats(); ++i) {
            this.isSeatAvailable[i] = true;
        }

        this.flightClass = flightClass;
    }

    private boolean hasSeating() {
        return this.passengers < getSeats();
    }

    private void handleTooMany() {
        System.out.println("Too many'");
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return this.totalCarryOns + carryOns <= this.maxCarryOns;
    }

    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= getSeats();
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.passengers = this.passengers + f2.passengers;
        return newFlight;
    }
    @Override
    public String toString() {
        if(flightNumber != null)
            return "Flight #" + flightNumber;
        else if(flightClass != null)
            return "Flight Class" + flightClass;
        else
            return "Flight idenity not set";
    }

    public enum FlightCrewJob {
        Pilot,
        CoPilot,
        FlightAttendant,
        AirMarshal
    }
    public void addPassengers(String filename) throws IOException {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(filename));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                passengers += Integer.valueOf(parts[0]);
            }
    } finally {
            if(reader != null)
                reader.close();
        }
        }
}
