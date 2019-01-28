package com.plane.tickets.project.sellingplanetickets.repositories;

import com.plane.tickets.project.sellingplanetickets.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, Integer> {


}
