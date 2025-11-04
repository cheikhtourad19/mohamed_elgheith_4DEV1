package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Client;
import com.example.mohamed_elgheith_4dev1.entity.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    List<Fournisseur> findAll();
    Fournisseur findById(long id);
    Fournisseur addFournisseur(Fournisseur fournisseur);
    void deleteFournisseur(long id);
    Fournisseur updateFournisseur(Fournisseur fournisseur);

}
