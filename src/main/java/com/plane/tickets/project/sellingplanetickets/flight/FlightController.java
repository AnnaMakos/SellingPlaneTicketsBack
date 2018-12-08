package com.plane.tickets.project.sellingplanetickets.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;


    @RequestMapping("/flights")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @RequestMapping("/flights/{id}")
    public Flight getFlights(@PathVariable int id) {
        return flightService.getFlight(id);
    }

    @RequestMapping("/planes/{id}/flights")
    public List<Flight> getAllFlightsByPlane(@PathVariable int id){
        return flightService.getFlightsByPlane(id);
    }


    @RequestMapping("/connections/{id}/flights")
    public List<Flight> getAllFlightsByConnection(@PathVariable int id){
        return flightService.getFlightsByConnection(id);
    }

    @PostMapping(value = "/flights", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void addFlight(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }

    @PutMapping(value = "/flights/{id}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void updateFlight(@RequestBody Flight flight, @PathVariable int id) {
        flightService.updateFlight(flight, id);
    }

    @DeleteMapping(value = "/flights/{id}")
    public void deleteFlight(@PathVariable int id) {
        flightService.deleteFlight(id);
    }

}
