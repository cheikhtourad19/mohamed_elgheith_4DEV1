package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Client;

import java.util.List;

public interface IClientService {
    List<Client> findAll();
    Client findById(long id);
    Client addClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Client Client);
}
