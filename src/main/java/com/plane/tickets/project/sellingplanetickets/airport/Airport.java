package com.plane.tickets.project.sellingplanetickets.airport;

import com.plane.tickets.project.sellingplanetickets.connections.Connections;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "airport")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airport_id")
    private int airportID;

    @Column(name = "airport_name")
    private String airportName;

    @OneToMany(mappedBy = "arrivalAirport", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Connections> departureConnections;

    @OneToMany(mappedBy = "departureAirport", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Connections> arrivalConnections;

    public List<Connections> getDepartureConnections() {
        return departureConnections;
    }

    public void setDepartureConnections(List<Connections> departureConnections) {
        this.departureConnections = departureConnections;
    }

    public List<Connections> getArrivalConnections() {
        return arrivalConnections;
    }

    public void setArrivalConnections(List<Connections> arrivalConnections) {
        this.arrivalConnections = arrivalConnections;
    }

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
