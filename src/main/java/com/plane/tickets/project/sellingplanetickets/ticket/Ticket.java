package com.plane.tickets.project.sellingplanetickets.ticket;


import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @Column(name = "ticked_id")
    private int ticketID;

    @Column(name = "user_id")
    private int userID;

    @Column(name = "flight_id")
    private int flightID;

    @Column(name = "ticket_cost")
    private double ticketCost;

    @Column(name = "category")
    private int category;

    @Column(name = "which_row")
    private int whichRow;

    @Column(name = "place")
    private int place;

    public Ticket() {
    }

    public Ticket(int userID, int flightID, double ticketCost, int category, int whichRow, int place) {
        this.userID = userID;
        this.flightID = flightID;
        this.ticketCost = ticketCost;
        this.category = category;
        this.whichRow = whichRow;
        this.place = place;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
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
                ", userID=" + userID +
                ", flightID=" + flightID +
                ", ticketCost=" + ticketCost +
                ", category=" + category +
                ", whichRow=" + whichRow +
                ", place=" + place +
                '}';
    }
}
