package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Commande;
import com.example.mohamed_elgheith_4dev1.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements ICommandeService {
    @Autowired
    private CommandeRepository commandeRepository;


    @Override
    public List<Commande> findAll() {
        return this.commandeRepository.findAll();
    }

    @Override
    public Commande findCommandeById(Long id) {
        return this.commandeRepository.findById(id).orElse(null);
    }

    @Override
    public Commande addCommande(Commande commande) {
        return this.commandeRepository.save(commande);
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return this.commandeRepository.save(commande);
    }

    @Override
    public void deleteCommande(Commande commande) {
        this.commandeRepository.delete(commande);
    }
}
