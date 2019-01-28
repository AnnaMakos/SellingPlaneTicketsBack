package com.plane.tickets.project.sellingplanetickets.services;

import com.plane.tickets.project.sellingplanetickets.model.Airport;
import com.plane.tickets.project.sellingplanetickets.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {

    @Autowired
    AirportRepository airportRepository;

    public List<Airport> getAllAirports() {
        List<Airport> airports = new ArrayList<>();
        airportRepository.findAll().forEach(airports::add);
        return airports;
    }

    public Airport getAirport(int id) {
        return airportRepository.findById(id).get();
    }

    public void addAirport(Airport airport) {
        airportRepository.save(airport);
    }

    public void updateAirport(Airport airport, int id) {
        airportRepository.save(airport);
    }

    public void deleteAirport(int id) {
        airportRepository.deleteById(id);
    }


}
