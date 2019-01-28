package com.plane.tickets.project.sellingplanetickets.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "connections")
public class Connections {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "connection_id")
    private int connectionID;

    @JsonIgnore
    @OneToMany(mappedBy = "connection")
    private List<Flight> flights;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="departure_airport_id")
    private Airport departureAirport;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="arrival_airport_id")
    private Airport arrivalAirport;

    public Connections() {

    }

    public Connections( Airport departureAirport, Airport arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getConnectionID() {
        return connectionID;
    }

    public void setConnectionID(int connectionID) {
        this.connectionID = connectionID;
    }

    @Override
    public String toString() {
        return "Connections{" +
                "connectionID=" + connectionID +
                ", departureAirportID=" +
                ", arrivalAirportID=" +
                ", flightTime='" + '\'' +
                ", ticketCost=" +
                '}';
    }
}
