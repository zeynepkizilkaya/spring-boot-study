package com.example.store;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight getFlightById(long id) {
        return flightRepository.findById(id);
    }

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public Flight updateFlight(long id, Flight updatedFlight) {

        Flight existingFlight = flightRepository.findById(id);

        if (existingFlight == null) {
            return null;
        }

        existingFlight.setFlightNumber(updatedFlight.getFlightNumber());
        existingFlight.setAirline(updatedFlight.getAirline());
        existingFlight.setOrigin(updatedFlight.getOrigin());
        existingFlight.setDestination(updatedFlight.getDestination());

        return flightRepository.save(existingFlight);
    }

    public boolean deleteFlight(long id) {
        return flightRepository.deleteById(id);
    }
}