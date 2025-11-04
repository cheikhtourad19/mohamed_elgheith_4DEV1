package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Fournisseur;
import com.example.mohamed_elgheith_4dev1.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurServiceImpl implements IFournisseurService {
    @Autowired
    private FournisseurRepository fournisseurRepository;

    @Override
    public List<Fournisseur> findAll() {
        return this.fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur findById(long id) {
        return this.fournisseurRepository.findById(id).orElse(null);
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur fournisseur) {
        return this.fournisseurRepository.save(fournisseur);
    }

    @Override
    public void deleteFournisseur(long id) {
this.fournisseurRepository.deleteById(id);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur fournisseur) {
        return this.fournisseurRepository.save(fournisseur);
    }
}
