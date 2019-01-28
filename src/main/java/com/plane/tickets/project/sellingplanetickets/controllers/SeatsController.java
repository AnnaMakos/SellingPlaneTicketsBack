package com.plane.tickets.project.sellingplanetickets.controllers;

import com.plane.tickets.project.sellingplanetickets.model.Seats;
import com.plane.tickets.project.sellingplanetickets.services.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SeatsController {

    @Autowired
    private SeatsService seatsService;


    @RequestMapping("/seats")
    public List<Seats> getAllSeats() {
        return seatsService.getAllSeats();
    }

    @RequestMapping("/flights/{id}/seats")
    public List<Seats> getAllSeatsByFlight(@PathVariable int id) {
        return seatsService.getAllSeatsByFlight(id);
    }


    @RequestMapping("/seats/{id}")
    public Seats getSeats(@PathVariable int id) {
        return seatsService.getSeat(id);
    }

    @PostMapping(value = "/seats")
    public void addSeat(@RequestBody Seats seat) {
        seatsService.addSeat(seat);
    }

    @DeleteMapping(value = "/seats/{id}")
    public void deleteSeat(@PathVariable int id) {
        seatsService.deleteSeat(id);
    }
}
