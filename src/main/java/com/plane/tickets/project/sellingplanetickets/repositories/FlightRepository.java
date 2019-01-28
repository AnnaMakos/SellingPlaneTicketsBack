package com.plane.tickets.project.sellingplanetickets.repositories;


import com.plane.tickets.project.sellingplanetickets.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    List<Flight> findByPlanePlaneID(int id);
    List<Flight> findByConnectionConnectionID(int id);
}
