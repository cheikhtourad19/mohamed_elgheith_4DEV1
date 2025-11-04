package com.example.mohamed_elgheith_4dev1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class RecommandationIA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRec;
    private double scorePrediction;
    private Date generatedAt;

    @ManyToOne
    private Client client;
}
