package com.target.learning;

public class CrewMember extends Person{
    private Flight.FlightCrewJob job;

    public CrewMember(Flight.FlightCrewJob job) {
        this.job = job;
    }
    public void setJob(Flight.FlightCrewJob job) {
        this.job = job;
    }

}
