package com.plane.tickets.project.sellingplanetickets.flight;


import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
