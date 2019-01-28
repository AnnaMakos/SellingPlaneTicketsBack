package com.plane.tickets.project.sellingplanetickets.repositories;

import com.plane.tickets.project.sellingplanetickets.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Integer> {
}

