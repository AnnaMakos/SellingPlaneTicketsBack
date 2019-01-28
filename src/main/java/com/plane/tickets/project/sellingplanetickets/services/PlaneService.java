package com.plane.tickets.project.sellingplanetickets.services;


import com.plane.tickets.project.sellingplanetickets.model.Plane;
import com.plane.tickets.project.sellingplanetickets.repositories.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaneService {

    @Autowired
    PlaneRepository planeRepository;

    public List<Plane> getAllPlanes() {
        List<Plane> planes = new ArrayList<>();
        planeRepository.findAll().forEach(planes::add);
        return planes;
    }


    public Plane getPlane(int id) {
        return planeRepository.findById(id).get();
    }

    public void addPlane(Plane plane) {
        planeRepository.save(plane);
    }

    public void updatePlane(Plane plane, int id) {
        planeRepository.save(plane);
    }

    public void deletePlane(int id) {
        planeRepository.deleteById(id);
    }


}
