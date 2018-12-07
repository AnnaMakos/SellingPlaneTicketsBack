package com.plane.tickets.project.sellingplanetickets.flight;

import com.plane.tickets.project.sellingplanetickets.airport.Airport;
import com.plane.tickets.project.sellingplanetickets.connections.Connections;
import com.plane.tickets.project.sellingplanetickets.plane.Plane;
import com.plane.tickets.project.sellingplanetickets.ticket.Ticket;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private int flightID;

    @Column(name = "departure_date")
    private String departureDate;

    @Column(name = "departure_time")
    private String departureTime;

    @Column(name = "arrival_date")
    private String arrivalDate;

    @Column(name = "arrival_time")
    private String arrivalTime;

    @Column(name = "ticket_cost")
    private int ticketCost;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="connection_id")
    private Connections connection;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="plane_id")
    private Plane plane;

    @OneToMany(mappedBy = "flight", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Ticket> tickets;



    public Flight() {

    }

    public Flight(int connectionID, int planeID, String departureDate, String departureTime, String arrivalDate, String arrivalTime, int ticketCost, Connections connection, Plane plane) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.ticketCost = ticketCost;
        this.connection = connection;
        this.plane = plane;
    }

    public Connections getConnection() {
        return connection;
    }

    public void setConnection(Connections connection) {
        this.connection = connection;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightID=" + flightID +
                ", connectionID=" +
                ", planeID=" +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", ticketCost=" + ticketCost +
                '}';
    }
}
