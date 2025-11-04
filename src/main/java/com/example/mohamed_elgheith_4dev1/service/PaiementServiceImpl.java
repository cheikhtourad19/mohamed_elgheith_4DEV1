package com.example.mohamed_elgheith_4dev1.service;

import com.example.mohamed_elgheith_4dev1.entity.Paiement;
import com.example.mohamed_elgheith_4dev1.repository.PaiementRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementServiceImpl implements IPaiementService {
    @Autowired
    PaiementRepository paiementRepository;

    @Override
    public List<Paiement> findAll() {
        return this.paiementRepository.findAll();
    }

    @Override
    public Paiement getPaiementById(long id) {
        return this.paiementRepository.findById(id).orElse(null);
    }

    @Override
    public Paiement addPaiement(Paiement paiement) {
        return this.paiementRepository.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return this.paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiement(Paiement paiement) {
        this.paiementRepository.delete(paiement);
    }
}
