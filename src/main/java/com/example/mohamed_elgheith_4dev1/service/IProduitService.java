package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Client;
import com.example.mohamed_elgheith_4dev1.entity.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> findAll();
    Produit findProduitById(Long id);
    Produit addProduit(Produit produit);
    Produit updateProduit(Produit produit);
    void deleteProduit(Produit produit);
}
