package com.plane.tickets.project.sellingplanetickets.ticket;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    List<Ticket> findByUserUserID(int id);
    List<Ticket> findByFlightFlightID(int id);
}
