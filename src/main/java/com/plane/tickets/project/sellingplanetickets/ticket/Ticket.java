package com.plane.tickets.project.sellingplanetickets.ticket;


import com.plane.tickets.project.sellingplanetickets.flight.Flight;
import com.plane.tickets.project.sellingplanetickets.users.Users;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int ticketID;

    @Column(name = "ticket_cost")
    private double ticketCost;

    @Column(name = "category")
    private int category;

    @Column(name = "which_row")
    private int whichRow;

    @Column(name = "place")
    private int place;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="user_id")
    private Users user;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="flight_id")
    private Flight flight;

    public Ticket() {
    }

    public Ticket(int userID, int flightID, double ticketCost, int category, int whichRow, int place, Users user, Flight flight) {
        this.ticketCost = ticketCost;
        this.category = category;
        this.whichRow = whichRow;
        this.place = place;
        this.user = user;
        this.flight = flight;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }


    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getWhichRow() {
        return whichRow;
    }

    public void setWhichRow(int whichRow) {
        this.whichRow = whichRow;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketID=" + ticketID +
                ", ticketCost=" + ticketCost +
                ", category=" + category +
                ", whichRow=" + whichRow +
                ", place=" + place +
                '}';
    }
}
