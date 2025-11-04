package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Client;
import com.example.mohamed_elgheith_4dev1.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Client findById(long id) {
        return this.clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client addClient(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public void deleteClient(Client client) {
        this.clientRepository.delete(client);
    }
}
