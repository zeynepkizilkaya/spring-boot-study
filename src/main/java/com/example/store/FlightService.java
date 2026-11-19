package com.example.store;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

    @Service
    public class FlightService {

        private final List<Flight> flights = new ArrayList<>();

        public FlightService() {
            flights.add(new Flight(
                    1L, "TK1923", "Turkish Airlines", "IST", "FRA"
            ));

            flights.add(new Flight(
                    2L, "LH1300", "Lufthansa", "FRA", "IST"
            ));
        }

        public List<Flight> getAllFlights() {
            return flights;
        }

        public Flight getFlightById(long id) {

            for (Flight flight : flights) {
                if (flight.getId() == id) {
                    return flight;
                }
            }

            return null;
        }

        public Flight createFlight(Flight flight) {
            flights.add(flight);
            return flight;
        }

        public Flight updateFlight(long id, Flight updatedFlight) {

            for (Flight flight : flights) {

                if (flight.getId() == id) {

                    flight.setFlightNumber(updatedFlight.getFlightNumber());
                    flight.setAirline(updatedFlight.getAirline());
                    flight.setOrigin(updatedFlight.getOrigin());
                    flight.setDestination(updatedFlight.getDestination());

                    return flight;
                }
            }

            return null;
        }

        public boolean deleteFlight(long id) {

            return flights.removeIf(
                    flight -> flight.getId() == id
            );
        }
    }

