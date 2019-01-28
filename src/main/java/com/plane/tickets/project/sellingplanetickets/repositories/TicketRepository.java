package com.plane.tickets.project.sellingplanetickets.repositories;


import com.plane.tickets.project.sellingplanetickets.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    List<Ticket> findByUserId(int id);
    List<Ticket> findByFlightFlightID(int id);
}
