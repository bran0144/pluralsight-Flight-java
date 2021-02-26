package com.target.learning;

public class Flight {
    private int passengers;
    private int flightNumber;
    private int totalCheckedBags;
    private int seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    private int maxCarryOns;
    private int totalCarryOns;

    public Flight() {
        this.maxCarryOns = this.seats * 2;
        this.isSeatAvailable = new boolean[this.seats];

        for(int i = 0; i < this.seats; ++i) {
            this.isSeatAvailable[i] = true;
        }

    }

    public Flight(int flightNumber) {
        this.maxCarryOns = this.seats * 2;
        this.isSeatAvailable = new boolean[this.seats];

        for(int i = 0; i < this.seats; ++i) {
            this.isSeatAvailable[i] = true;
        }

        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.maxCarryOns = this.seats * 2;
        this.isSeatAvailable = new boolean[this.seats];

        for(int i = 0; i < this.seats; ++i) {
            this.isSeatAvailable[i] = true;
        }

        this.flightClass = flightClass;
    }

    public void add1Passenger() {
        if (this.hasSeating()) {
            ++this.passengers;
        } else {
            this.handleTooMany();
        }

    }

    public void add1Passenger(int bags) {
        if (this.hasSeating()) {
            this.add1Passenger();
            this.totalCheckedBags += bags;
        }

    }

    private boolean hasSeating() {
        return this.passengers < this.seats;
    }

    private void handleTooMany() {
        System.out.println("Too many'");
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return this.totalCarryOns + carryOns <= this.maxCarryOns;
    }

    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= this.seats;
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = this.seats;
        newFlight.passengers = this.passengers + f2.passengers;
        return newFlight;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
