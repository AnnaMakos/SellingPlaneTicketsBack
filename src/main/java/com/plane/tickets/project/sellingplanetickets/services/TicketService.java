package com.plane.tickets.project.sellingplanetickets.services;

import com.plane.tickets.project.sellingplanetickets.repositories.TicketRepository;
import com.plane.tickets.project.sellingplanetickets.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;


    public List<Ticket> getAllTickets() {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findAll().forEach(tickets::add);
        return tickets;
    }

    public List<Ticket> getAllTicketsByUser(int userId) {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findByUserId(userId).forEach(tickets::add);
        return tickets;
    }


    public Ticket getTicket(int id) {
        return ticketRepository.findById(id).get();
    }

    public void addTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void updateTicket(Ticket ticket, int id) {
        ticketRepository.save(ticket);
    }

    public void deleteTicket(int id) {
        ticketRepository.deleteById(id);
    }

    public List<Ticket> getAllTicketsByFlight(int id) {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findByFlightFlightID(id).forEach(tickets::add);
        return tickets;
    }
}
