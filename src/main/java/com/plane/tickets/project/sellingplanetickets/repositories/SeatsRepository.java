package com.plane.tickets.project.sellingplanetickets.repositories;

import com.plane.tickets.project.sellingplanetickets.model.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatsRepository extends JpaRepository<Seats, Integer> {

    List<Seats> findByFlightFlightID(int id);
}
