package com.plane.tickets.project.sellingplanetickets.connections;

import javax.persistence.*;

@Entity
@Table(name = "connections")
public class Connections {


    @Id
    @Column(name = "connection_id")
    private int connectionID;

    @Column(name = "departure_airport_id")
    private int departureAirportID;

    @Column(name = "arrival_airport_id")
    private int arrivalAirportID;

    @Column(name = "flight_time")
    private String flightTime;

    @Column(name = "ticket_cost")
    private double ticketCost;

    public Connections() {

    }

    public Connections(int departureAirportID, int arrivalAirportID, String flightTime, double ticketCost) {
        this.departureAirportID = departureAirportID;
        this.arrivalAirportID = arrivalAirportID;
        this.flightTime = flightTime;
        this.ticketCost = ticketCost;
    }

    public int getConnectionID() {
        return connectionID;
    }

    public void setConnectionID(int connectionID) {
        this.connectionID = connectionID;
    }

    public int getDepartureAirportID() {
        return departureAirportID;
    }

    public void setDepartureAirportID(int departureAirportID) {
        this.departureAirportID = departureAirportID;
    }

    public int getArrivalAirportID() {
        return arrivalAirportID;
    }

    public void setArrivalAirportID(int arrivalAirportID) {
        this.arrivalAirportID = arrivalAirportID;
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
                ", departureAirportID=" + departureAirportID +
                ", arrivalAirportID=" + arrivalAirportID +
                ", flightTime='" + flightTime + '\'' +
                ", ticketCost=" + ticketCost +
                '}';
    }
}
