package com.example.mohamed_elgheith_4dev1.entity;

import com.example.mohamed_elgheith_4dev1.types.CategorieProduit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String nom;
    private double prix;
    private CategorieProduit categorie;
    private int stock;
    private double scoreIA;

    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    private List<LigneCommande> ligneCommandes;

    @ManyToMany
    private List<Fournisseur> fournisseurs;
}
