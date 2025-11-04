package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Client;
import com.example.mohamed_elgheith_4dev1.entity.Paiement;

import java.util.List;

public interface IPaiementService {
    List<Paiement> findAll();
    Paiement getPaiementById(long id);
    Paiement addPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Paiement paiement);
}
