package com.plane.tickets.project.sellingplanetickets.connections;
import com.plane.tickets.project.sellingplanetickets.airport.Airport;
import com.plane.tickets.project.sellingplanetickets.flight.Flight;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "connections")
public class Connections {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "connection_id")
    private int connectionID;


    @Column(name = "flight_time")
    private String flightTime;

    @Column(name = "ticket_cost")
    private double ticketCost;

    @OneToMany(mappedBy = "connection", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Flight> flights;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="departure_airport_id")
    private Airport departureAirport;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="arrival_airport_id")
    private Airport arrivalAirport;

    public Connections() {

    }

    public Connections(int departureAirportID, int arrivalAirportID, String flightTime, double ticketCost, Airport departureAirport, Airport arrivalAirport) {
        this.flightTime = flightTime;
        this.ticketCost = ticketCost;
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

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    @Override
    public String toString() {
        return "Connections{" +
                "connectionID=" + connectionID +
                ", departureAirportID=" +
                ", arrivalAirportID=" +
                ", flightTime='" + flightTime + '\'' +
                ", ticketCost=" + ticketCost +
                '}';
    }
}
