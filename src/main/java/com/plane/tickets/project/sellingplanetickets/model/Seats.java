package com.plane.tickets.project.sellingplanetickets.model;

import javax.persistence.*;

@Entity
@Table(name = "seats")
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private int seatID;


    @Column(name = "category")
    private int category;

    @Column(name = "which_row")
    private int whichRow;

    @Column(name = "place")
    private int place;

    @Column(name = "is_free")
    private boolean isFree;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="flight_id")
    private Flight flight;

    public Seats() {

    }

    public Seats(int category, int whichRow, int place, boolean isFree, Flight flight) {
        this.category = category;
        this.whichRow = whichRow;
        this.place = place;
        this.isFree = isFree;
        this.flight = flight;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
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

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
