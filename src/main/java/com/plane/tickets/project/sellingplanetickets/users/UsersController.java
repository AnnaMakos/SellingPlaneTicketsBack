package com.plane.tickets.project.sellingplanetickets.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;


    @RequestMapping("/users")
    public List<Users> getAllUsers() {
        return usersService.getAlUsers();
    }

    @RequestMapping("/users/{id}")
    public Users getUsers(@PathVariable int id) {
        return usersService.getUsers(id);
    }

    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void addUsers(@RequestBody Users users) {
        usersService.addUsers(users);
    }

    @PutMapping(value = "/users/{id}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void updateUsers(@RequestBody Users users, @PathVariable int id) {
        usersService.updateUsers(users, id);
    }

    @DeleteMapping(value = "/users/{id}")
    public void deleteUsers(@PathVariable int id) {
        usersService.deleteUsers(id);
    }

}
