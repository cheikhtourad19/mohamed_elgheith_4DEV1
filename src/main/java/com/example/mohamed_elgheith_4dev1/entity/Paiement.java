package com.example.mohamed_elgheith_4dev1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;
    private double montant;
    private LocalDate datePaiement;
    private String modePaiement;

    @OneToOne(mappedBy = "paiement",cascade = CascadeType.ALL)
    private Commande commande;
}
