package com.example.mohamed_elgheith_4dev1.repository;

import com.example.mohamed_elgheith_4dev1.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
