package com.example.easytrip.repository;

import org.springframework.stereotype.Repository;
import java.util.HashMap;

@Repository
public class FlightRepository {

    // HashMaps to store flight data
    private HashMap<String, String> flights = new HashMap<>();
    
    // Constructor
    public FlightRepository() {
        // Initialize some dummy data
        flights.put("AI101", "New York");
        flights.put("AI102", "London");
    }

    // Getter method for flights HashMap
    public HashMap<String, String> getFlights() {
        return flights;
    }
}
