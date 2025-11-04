package com.example.mohamed_elgheith_4dev1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class LigneCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLigne;
    private int quantite;
    private double prix;

    @ManyToOne
    private Commande commande;

    @ManyToOne
    private Produit produit;


}
