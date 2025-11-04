package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Produit;
import com.example.mohamed_elgheith_4dev1.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements IProduitService{

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public List<Produit> findAll() {
        return this.produitRepository.findAll();
    }

    @Override
    public Produit findProduitById(Long id) {
        return this.produitRepository.findById(id).orElse(null);
    }

    @Override
    public Produit addProduit(Produit produit) {
        return this.produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return this.produitRepository.save(produit);
    }

    @Override
    public void deleteProduit(Produit produit) {
        this.produitRepository.delete(produit);
    }
}
