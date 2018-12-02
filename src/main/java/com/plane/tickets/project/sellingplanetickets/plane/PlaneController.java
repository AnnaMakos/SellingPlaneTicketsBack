package com.plane.tickets.project.sellingplanetickets.plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

    @PutMapping(value = "/planes/{id}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void updatePlane(@RequestBody Plane plane, @PathVariable int id) {
        planeService.updatePlane(plane, id);
    }

    @DeleteMapping(value = "/planes/{id}",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void deletePlane(@PathVariable int id) {
        planeService.deletePlane(id);
    }


}
