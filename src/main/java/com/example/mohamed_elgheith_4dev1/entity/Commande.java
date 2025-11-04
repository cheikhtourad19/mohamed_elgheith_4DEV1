package com.example.mohamed_elgheith_4dev1.entity;

import com.example.mohamed_elgheith_4dev1.types.StatuCmd;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDate date;
    private StatuCmd statut;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
    private List<LigneCommande> ligneCommandes;

    @OneToOne
    private Paiement paiement;

}
