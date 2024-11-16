package dev.fr.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom", unique = true, nullable = false, length = 100)
    private String nom;

    @OneToMany(mappedBy = "categories")
    private Set<Produit> produits;

    public Categorie() {
    }

    public Categorie(String nom) {
        this.nom = nom;
    }

}
