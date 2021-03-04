package com.target.learning;

import java.io.BufferedReader;
import java.io.IOException;

public class CrewManager {
    private final static String FILENAME = "...";
    private static CrewMember[] pool;

    public static CrewMember
    FindAvailable(Flight.FlightCrewJob job) {
        CrewMember cm = null;
        for (int i = 0; i < pool.length; i++) {
            if (pool[i] != null && pool[i].job == job) {
                cm = pool[i];
                pool[i] = null;
                break;
            }
        }
        return cm;
    }

    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(FILENAME);
            String line = null;
            int idx = 0;
            pool = new CrewMember[10];
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Flight.FlightCrewJob job = Flight.FlightCrewJob.valueOf(parts[0]);
                pool[idx] = new CrewMember(job);
                pool[idx].setName(parts[1]);
                idx++;

            }
        } catch (IOException e) {
            //handle error
        }
    }
}
