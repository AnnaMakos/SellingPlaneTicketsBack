package com.plane.tickets.project.sellingplanetickets.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "plane")
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plane_id")
    private int planeID;

    @Column(name = "plane_name")
    private String planeName;

    @JsonIgnore
    @OneToMany(mappedBy = "plane", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Flight> flights;

    public Plane() { }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public Plane(String planeName) {
        this.planeName = planeName;
    }

    public int getPlaneID() {
        return planeID;
    }

    public void setPlaneID(int planeID) {
        this.planeID = planeID;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "planeID=" + planeID +
                ", planeName='" + planeName + '\'' +
                '}';
    }
}
