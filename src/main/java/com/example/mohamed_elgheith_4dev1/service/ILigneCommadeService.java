package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Client;
import com.example.mohamed_elgheith_4dev1.entity.LigneCommande;

import java.util.List;

public interface ILigneCommadeService {
    List<LigneCommande> findAll();
    LigneCommande getLigneCommandeById(long id);
    LigneCommande saveLigneCommande(LigneCommande ligneCommande);
    LigneCommande updateLigneCommande(LigneCommande ligneCommande);
    void deleteLigneCommande(LigneCommande ligneCommande);
}
