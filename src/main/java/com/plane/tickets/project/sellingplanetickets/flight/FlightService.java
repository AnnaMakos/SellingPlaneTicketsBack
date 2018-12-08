package com.plane.tickets.project.sellingplanetickets.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        flightRepository.findAll().forEach(flights::add);
        return flights;
    }


    public Flight getFlight(int id) {
        return flightRepository.findById(id).get();
    }

    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }

    public void updateFlight(Flight flight, int id) {
        flightRepository.save(flight);
    }

    public void deleteFlight(int id) {
        flightRepository.deleteById(id);
    }

    public List<Flight> getFlightsByPlane(int id) {
        List<Flight> flights = new ArrayList<>();
        flightRepository.findByPlanePlaneID(id).forEach(flights::add);
        return flights;
    }

    public List<Flight> getFlightsByConnection(int id) {
        List<Flight> flights = new ArrayList<>();
        flightRepository.findByConnectionConnectionID(id).forEach(flights::add);
        return flights;
    }
}
