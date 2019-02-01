package com.plane.tickets.project.sellingplanetickets.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.plane.tickets.project.sellingplanetickets.model.Connections;
import com.plane.tickets.project.sellingplanetickets.model.Plane;
import com.plane.tickets.project.sellingplanetickets.model.Seats;
import com.plane.tickets.project.sellingplanetickets.model.Ticket;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private int flightID;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "departure_time")
    private String departureTime;

    @Column(name = "arrival_date")
    private Date arrivalDate;

    @Column(name = "arrival_time")
    private String arrivalTime;

    @Column(name = "ticket_cost")
    private int ticketCost;

    @ManyToOne
    @JoinColumn(name="connection_id")
    private Connections connection;

    @ManyToOne
    @JoinColumn(name="plane_id")
    private Plane plane;

    @JsonIgnore
    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    @JsonIgnore
    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<Seats> seats;


    public Flight() {

    }

    public Flight(int connectionID, int planeID, Date departureDate, String departureTime, Date arrivalDate, String arrivalTime, int ticketCost, Connections connection, Plane plane) {
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

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
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
