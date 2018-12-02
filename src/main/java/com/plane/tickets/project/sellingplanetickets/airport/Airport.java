package com.plane.tickets.project.sellingplanetickets.airport;

import javax.persistence.*;

@Entity
@Table(name = "airport")
public class Airport {

    @Id
    @Column(name = "airport_id")
    private int airportID;

    @Column(name = "airport_name")
    private String airportName;

    public Airport() {

    }

    public Airport(String airportName) {
        this.airportName = airportName;
    }

    public int getAirportID() {
        return airportID;
    }

    public void setAirportID(int airportID) {
        this.airportID = airportID;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportID=" + airportID +
                ", airportName='" + airportName + '\'' +
                '}';
    }
}
