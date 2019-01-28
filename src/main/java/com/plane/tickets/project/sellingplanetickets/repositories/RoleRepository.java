package com.plane.tickets.project.sellingplanetickets.repositories;

import java.util.Optional;

import com.plane.tickets.project.sellingplanetickets.model.Role;
import com.plane.tickets.project.sellingplanetickets.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}