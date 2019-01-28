package com.plane.tickets.project.sellingplanetickets.controllers;

import com.plane.tickets.project.sellingplanetickets.model.User;
import com.plane.tickets.project.sellingplanetickets.security.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @RequestMapping(value="/users", params="login")
    private User getUserByLogin(@RequestParam("login") String login){
        return userDetailsService.findUserByUsername(login);
    }

    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return userDetailsService.getAllUsers();
    }

    @PostMapping(value = "/users")
    public void updateUser(@RequestBody User user){
        userDetailsService.updateUser(user);
    }
}
