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

    // Parametresiz constructor
    public Flight() {
    }

    // Mevcut constructor
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
//getlerde return edersin döndürmeli çünkü bilgiyi
//setlerde ise void var çünkü bir şey dönmüyor ve set etmemiz gerekiyor this ile doğrulayıp
//boş bir constructor'a değer atıyoruz yani set ile kısaca

