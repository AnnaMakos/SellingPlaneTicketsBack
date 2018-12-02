package com.plane.tickets.project.sellingplanetickets.connections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConnectionsService {
    @Autowired
    ConnectionsRepository connectionsRepository;

    public List<Connections> getAllConnections() {
        List<Connections> connections = new ArrayList<>();
        connectionsRepository.findAll().forEach(connections::add);
        return connections;
    }


    public Connections getConnections(int id) {
        return connectionsRepository.findById(id).get();
    }

    public void addConnections(Connections connections) {
        connectionsRepository.save(connections);
    }

    public void updateConnections(Connections connections, int id) {
        connectionsRepository.save(connections);
    }

    public void deleteConnections(int id) {
        connectionsRepository.deleteById(id);
    }

}
