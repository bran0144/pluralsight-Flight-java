package com.target.learning;

public class Flight {
    private int passengers;
    private int flightNumber;
    private int totalCheckedBags;
    private char flightClass;
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

}
