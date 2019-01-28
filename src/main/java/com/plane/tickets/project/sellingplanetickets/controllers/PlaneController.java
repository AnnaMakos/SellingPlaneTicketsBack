package com.plane.tickets.project.sellingplanetickets.controllers;
import com.plane.tickets.project.sellingplanetickets.model.Plane;
import com.plane.tickets.project.sellingplanetickets.services.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @RequestMapping("/planes")
    public List<Plane> getAllPlanes() {
        return planeService.getAllPlanes();
    }

    @RequestMapping("/planes/{id}")
    public Plane getPlane(@PathVariable int id) {
        return planeService.getPlane(id);
    }

    @PostMapping(value = "/planes")
    public void addPlane(@RequestBody Plane plane) {
        planeService.addPlane(plane);
    }

    @PutMapping(value = "/planes/{id}")
    public void updatePlane(@RequestBody Plane plane, @PathVariable int id) {
        planeService.updatePlane(plane, id);
    }

    @DeleteMapping(value = "/planes/{id}")
    public void deletePlane(@PathVariable int id) {
        planeService.deletePlane(id);
    }


}
