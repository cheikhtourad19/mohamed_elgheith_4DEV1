package com.example.mohamed_elgheith_4dev1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nom;
    private String email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Commande> commandes;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<RecommandationIA>  recommandationIA;


}
