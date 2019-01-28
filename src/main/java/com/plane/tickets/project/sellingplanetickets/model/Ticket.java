package com.plane.tickets.project.sellingplanetickets.model;


import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int ticketID;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "ticket_cost")
    private double ticketCost;

    @Column(name = "category")
    private String category;

    @Column(name = "which_row")
    private int whichRow;

    @Column(name = "place")
    private int place;

    @Column(name = "insurance")
    private boolean insurance;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="flight_id")
    private Flight flight;

    @Column(name = "phone_number")
    private String phonenumber;

    @Column(name = "pesel")
    private String pesel;

    public Ticket() {
    }

    public Ticket(String name, String surname, double ticketCost, String category, int whichRow, int place, boolean insurance, User user, Flight flight, String phonenumber, String pesel) {
        this.name = name;
        this.surname = surname;
        this.ticketCost = ticketCost;
        this.category = category;
        this.whichRow = whichRow;
        this.place = place;
        this.insurance = insurance;
        this.user = user;
        this.flight = flight;
        this.phonenumber = phonenumber;
        this.pesel = pesel;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
