package com.plane.tickets.project.sellingplanetickets.repositories;

import java.util.Optional;

import com.plane.tickets.project.sellingplanetickets.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}