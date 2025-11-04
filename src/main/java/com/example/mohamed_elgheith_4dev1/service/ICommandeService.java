package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Client;
import com.example.mohamed_elgheith_4dev1.entity.Commande;

import java.util.List;

public interface ICommandeService {
    List<Commande> findAll();
    Commande findCommandeById(Long id);
    Commande addCommande(Commande commande);
    Commande updateCommande(Commande commande);
    void deleteCommande(Commande commande);
}
