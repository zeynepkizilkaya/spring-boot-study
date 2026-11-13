package com.example.store;

public class Flight {
    //create the variables then we'll assign them the parameters
    private Long id;
    private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    //don't forget the constructor of these then we'll use setter getter to reach them
    //constructors name is the same one within the class
    //hepsi için constructor içine isimlerini yazarsın, sonra this. ile belirtme constructor altına ise get set ile başla
    public Flight(Long id,String flightNumber,String airline,String origin,String destination){
        this.id=id;
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.origin=origin;
        this.destination=destination;

    }

    public Long getId() {
        return id;
    }

    public String getAirline() {
        return airline;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

}
