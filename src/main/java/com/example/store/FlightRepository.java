package com.example.store;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightRepository {

    private final List<Flight> flights = new ArrayList<>();

    public FlightRepository() {
        flights.add(new Flight(
                1L, "TK1923", "Turkish Airlines", "IST", "FRA"
        ));

        flights.add(new Flight(
                2L, "LH1300", "Lufthansa", "FRA", "IST"
        ));
    }

    //findAll() listedeki her şeyi bulup döndürür
    public List<Flight> findAll() {
        return flights;
    }

    //urldeki id ile
    public Flight findById(long id) {
        for (Flight flight : flights) {
            if (flight.getId() == id) {
                return flight;
            }
        }
        return null;
    }

    public Flight save(Flight flight) {

        for (int i = 0; i < flights.size(); i++) {

            if (flights.get(i).getId().equals(flight.getId())) {
                flights.set(i, flight);
                return flight;
            }
        }

        flights.add(flight);
        return flight;
    }

    public boolean deleteById(long id) {
        return flights.removeIf(
                flight -> flight.getId() == id
        );
    }
}