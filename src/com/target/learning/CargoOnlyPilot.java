package com.target.learning;

public class CargoOnlyPilot extends Pilot{
    @Override
    public boolean canAccept(Flight f) {
        return f.getPassengers() == 0;
    }
}
