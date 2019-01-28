package com.plane.tickets.project.sellingplanetickets.controllers;

import com.plane.tickets.project.sellingplanetickets.model.Connections;
import com.plane.tickets.project.sellingplanetickets.services.ConnectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
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
        return connectionsService.getConnectionsByDepartureAirport(id);
    }


    @PostMapping(value = "/connections")
    public void addPlane(@RequestBody Connections connections) {
        connectionsService.addConnections(connections);
    }

    @PutMapping(value = "/connections/{id}")
    public void updateConnections(@RequestBody Connections connections, @PathVariable int id) {
        connectionsService.updateConnections(connections, id);
    }

    @DeleteMapping(value = "/connections/{id}")
    public void deleteConnections(@PathVariable int id) {
        connectionsService.deleteConnections(id);
    }

}
