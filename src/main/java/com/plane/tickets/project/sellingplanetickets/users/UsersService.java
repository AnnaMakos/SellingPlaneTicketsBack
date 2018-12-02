package com.plane.tickets.project.sellingplanetickets.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;

    public List<Users> getAlUsers() {
        List<Users> users = new ArrayList<>();
        usersRepository.findAll().forEach(users::add);
        return users;
    }


    public Users getUsers(int id) {
        return usersRepository.findById(id).get();
    }

    public void addUsers(Users users) {
        usersRepository.save(users);
    }

    public void updateUsers(Users users, int id) {
        usersRepository.save(users);
    }

    public void deleteUsers(int id) {
        usersRepository.deleteById(id);
    }
}
