package dev.fr.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom", unique = true, nullable = false, length = 100)
    private String nom;

    @ManyToMany
    @JoinTable(name = "Prod_Ingre",
            joinColumns = @JoinColumn(name = "ID_Ingre", referencedColumnName
                    = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_Prod", referencedColumnName
                    = "ID")
    )
    private Set<Produit> produits = new HashSet<>();  // Initialisation de la collection

    public Ingredient() {
    }

    public Ingredient(String nom) {
        this.nom = nom;
    }

}
