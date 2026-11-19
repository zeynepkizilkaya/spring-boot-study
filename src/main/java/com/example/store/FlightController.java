package com.example.store;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    //burada dependency injection uyguladık. controller;işlemler için service sınıfına ihtiyac duyuyor ve bunu dışardan aldık
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/api/flights")
    public List<Flight> getFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/api/flights/{id}")
    public Flight getFlightById(@PathVariable long id) {
        return flightService.getFlightById(id);
    }

    @PostMapping("/api/flights")
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @PutMapping("/api/flights/{id}")
    public Flight updateFlight(
            @PathVariable long id,
            @RequestBody Flight updatedFlight) {

        return flightService.updateFlight(id, updatedFlight);
    }

    @DeleteMapping("/api/flights/{id}")
    public String deleteFlight(@PathVariable long id) {

        boolean removed = flightService.deleteFlight(id);

        if (removed) {
            return "Flight deleted successfully!";
        }

        return "Flight not found!";
    }
}

//previous controller was handling every task(ucus islemleri ekle sil vs) ama bu versiyonda service sınıfı actik ve iş yükünü azalttık controllerın
//controller burada veri yönetmiyor service e devrettik
