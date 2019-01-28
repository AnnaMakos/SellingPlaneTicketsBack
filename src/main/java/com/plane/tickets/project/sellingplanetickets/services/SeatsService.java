package com.plane.tickets.project.sellingplanetickets.services;

import com.plane.tickets.project.sellingplanetickets.repositories.SeatsRepository;
import com.plane.tickets.project.sellingplanetickets.model.Seats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeatsService {

    @Autowired
    SeatsRepository seatsRepository;

    public List<Seats> getAllSeats() {
        List<Seats> seats = new ArrayList<>();
        seatsRepository.findAll().forEach(seats::add);
        return seats;
    }

    public List<Seats> getAllSeatsByFlight(int id) {
        List<Seats> seats = new ArrayList<>();
        seatsRepository.findByFlightFlightID(id).forEach(seats::add);
        return seats;
    }

    public Seats getSeat(int id) {
        return seatsRepository.findById(id).get();
    }

    public void addSeat(Seats seat) {
        seatsRepository.save(seat);
    }

    public void deleteSeat(int id) {
        seatsRepository.deleteById(id);
    }

}
