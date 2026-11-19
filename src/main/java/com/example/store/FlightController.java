
package com.example.store;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
public class FlightController {

    private final List<Flight> flights = new ArrayList<>();

    public FlightController() {
        flights.add(new Flight(
                1L, "TK1923", "Turkish Airlines", "IST", "FRA"
        ));

        flights.add(new Flight(
                2L, "LH1300", "Lufthansa", "FRA", "IST"
        ));
    }

    // Bütün uçuşları getir
    @GetMapping("/api/flights")
    public List<Flight> getFlights() {
        return flights;
    }

    @GetMapping("/api/flights/{id}")//bu method get request karşılayacak demek!!!!!
    public Flight getFlightById(@PathVariable long id) {

        for (Flight flight : flights) {
            if (flight.getId() == id) {
                return flight;
            }
        }

        return null;
    }

    @PostMapping("/api/flights")
    public Flight createFlight(@RequestBody Flight flight) {
        flights.add(flight);
        return flight;
    }

    @PutMapping("/api/flights/{id}")
    public Flight updateFlight(@PathVariable long id, @RequestBody Flight updatedFlight) {
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

    @DeleteMapping("/api/flights/{id}")
    public String deleteFlight(@PathVariable long id){

        for (Flight flight : flights) {

            if (flight.getId() == id) {

                flights.remove(flight);

                return "Flight deleted successfully!";
            }
        }

        return "Flight not found!";
    }

    }




//restcontroller ise html sayfası görüntülemeyeceğiz homecontroller gibi, burada api yazıyoruz kullanıcıya json formatında veri döndüreceğiz

