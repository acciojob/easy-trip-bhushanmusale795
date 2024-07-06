package com.example.easytrip.service;

import com.example.easytrip.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class FlightService {

    private FlightRepository flightRepository;

    // Constructor injection
    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    // Method to get all flights
    public HashMap<String, String> getAllFlights() {
        return flightRepository.getFlights();
    }

    // Method to get flight by flight number
    public String getFlightByNumber(String flightNumber) {
        HashMap<String, String> flights = flightRepository.getFlights();
        return flights.get(flightNumber);
    }
}
