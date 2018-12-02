package com.plane.tickets.project.sellingplanetickets.plane;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlaneRepository extends JpaRepository<Plane, Integer> {


}
