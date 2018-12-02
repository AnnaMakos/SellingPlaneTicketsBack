package com.plane.tickets.project.sellingplanetickets.plane;

import javax.persistence.*;

@Entity
@Table(name = "plane")
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plane_id")
    private int planeID;

    @Column(name = "plane_name")
    private String planeName;

    public Plane() { }

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
