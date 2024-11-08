package dev.fr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Allergene {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom", unique = true, nullable = false, length = 100)
    private String nom;

    public Allergene() {
    }

    public Allergene(String nom) {
        this.nom = nom;
    }

}
