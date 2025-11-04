package com.example.mohamed_elgheith_4dev1.controller;

import com.example.mohamed_elgheith_4dev1.entity.Client;
import com.example.mohamed_elgheith_4dev1.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;
    @GetMapping
    public List<Client> findAll() {
        return this.clientService.findAll();
    }
    @GetMapping("/{id}")
    public Client getClient(@PathVariable long id) {
        return clientService.findById(id);

    }

    @PostMapping()
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @DeleteMapping()
    public void deleteClient(@RequestBody Client client) {
        clientService.deleteClient(client);
    }

    @PutMapping()
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }
}
