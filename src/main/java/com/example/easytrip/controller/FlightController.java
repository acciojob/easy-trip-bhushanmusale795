package com.example.easytrip.controller;

import com.example.easytrip.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private FlightService flightService;

    // Constructor injection
    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    // Endpoint to get all flights
    @GetMapping("")
    public HashMap<String, String> getAllFlights() {
        return flightService.getAllFlights();
    }

    // Endpoint to get flight by flight number
    @GetMapping("/{flightNumber}")
    public String getFlightByNumber(@PathVariable String flightNumber) {
        return flightService.getFlightByNumber(flightNumber);
    }
}
