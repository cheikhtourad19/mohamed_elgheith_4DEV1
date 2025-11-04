package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.LigneCommande;
import com.example.mohamed_elgheith_4dev1.repository.LigneCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneCommadeServiceImpl implements ILigneCommadeService {
    @Autowired
    LigneCommandeRepository ligneCommandeRepository;

    @Override
    public List<LigneCommande> findAll() {
        return this.ligneCommandeRepository.findAll();
    }

    @Override
    public LigneCommande getLigneCommandeById(long id) {
        return this.ligneCommandeRepository.findById(id).orElse(null);
    }

    @Override
    public LigneCommande saveLigneCommande(LigneCommande ligneCommande) {
        return this.ligneCommandeRepository.save(ligneCommande);
    }

    @Override
    public LigneCommande updateLigneCommande(LigneCommande ligneCommande) {
        return this.ligneCommandeRepository.save(ligneCommande);
    }

    @Override
    public void deleteLigneCommande(LigneCommande ligneCommande) {
        this.ligneCommandeRepository.delete(ligneCommande);
    }
}
