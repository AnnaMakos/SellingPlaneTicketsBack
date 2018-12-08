package com.plane.tickets.project.sellingplanetickets.connections;

import com.plane.tickets.project.sellingplanetickets.ticket.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConnectionsController {
    @Autowired
    private ConnectionsService connectionsService;

    @RequestMapping("/connections")
    public List<Connections> getAllConnections() {
        return connectionsService.getAllConnections();
    }

    @RequestMapping("/connections/{id}")
    public Connections getConnections(@PathVariable int id) {
        return connectionsService.getConnections(id);
    }

    @RequestMapping("/arrivalairports/{id}/connections")
    public List<Connections> getAllArrivalAirportConnections(@PathVariable int id) {
        return connectionsService.getConnectionsByArrivalAirport(id);
    }

    @RequestMapping("/departureairports/{id}/connections")
    public List<Connections> getAllDepartureAirportConnections(@PathVariable int id) {
        return connectionsService.getConnectionsByArrivalAirport(id);
    }


    @PostMapping(value = "/connections", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void addPlane(@RequestBody Connections connections) {
        connectionsService.addConnections(connections);
    }

    @PutMapping(value = "/connections/{id}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void updateConnections(@RequestBody Connections connections, @PathVariable int id) {
        connectionsService.updateConnections(connections, id);
    }

    @DeleteMapping(value = "/connections/{id}")
    public void deleteConnections(@PathVariable int id) {
        connectionsService.deleteConnections(id);
    }

}
