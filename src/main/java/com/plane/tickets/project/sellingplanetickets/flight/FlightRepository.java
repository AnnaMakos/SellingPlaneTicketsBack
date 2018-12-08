package com.plane.tickets.project.sellingplanetickets.flight;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    List<Flight> findByPlanePlaneID(int id);
    List<Flight> findByConnectionConnectionID(int id);
}
