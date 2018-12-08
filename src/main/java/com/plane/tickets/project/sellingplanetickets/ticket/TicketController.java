package com.plane.tickets.project.sellingplanetickets.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;


    @RequestMapping("/tickets")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @RequestMapping("/users/{id}/tickets")
    public List<Ticket> getAllTicketsByUser(@PathVariable int id) {
        return ticketService.getAllTicketsByUser(id);
    }

    @RequestMapping("/flights/{id}/tickets")
    public List<Ticket> getAllTicketsByFlight(@PathVariable int id) {
        return ticketService.getAllTicketsByFlight(id);
    }


    @RequestMapping("/tickets/{id}")
    public Ticket getTicket(@PathVariable int id) {
        return ticketService.getTicket(id);
    }

    @PostMapping(value = "/tickets", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void addTicket(@RequestBody Ticket ticket) {
        ticketService.addTicket(ticket);
    }

    @PutMapping(value = "/tickets/{id}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void updateTicket(@RequestBody Ticket ticket, @PathVariable int id) {
        ticketService.updateTicket(ticket, id);
    }

    @DeleteMapping(value = "/tickets/{id}")
    public void deleteTicket(@PathVariable int id) {
        ticketService.deleteTicket(id);
    }

}
