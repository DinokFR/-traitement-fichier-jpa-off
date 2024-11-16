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
import jakarta.persistence.ManyToOne;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom", unique = true, nullable = false, length = 100)
    private String nom;

    @Column(name = "graisse100g", nullable = false)
    private double graisse100g;

    @Column(name = "energie100g", nullable = true)
    private double energie100g;

    @Column(name = "sucres100g", nullable = true)
    private double sucres100g;

    @Column(name = "fibres100g", nullable = true)
    private double fibres100g;

    @Column(name = "proteines100g", nullable = true)
    private double proteines100g;

    @Column(name = "sel100g", nullable = true)
    private double sel100g;

    @Column(name = "vitA100g", nullable = true)
    private double vitA100g;

    @Column(name = "vitD100g", nullable = true)
    private double vitD100g;

    @Column(name = "vitE100g", nullable = true)
    private double vitE100g;

    @Column(name = "vitK100g", nullable = true)
    private double vitK100g;

    @Column(name = "vitC100g", nullable = true)
    private double vitC100g;

    @Column(name = "vitB1100g", nullable = true)
    private double vitB1100g;

    @Column(name = "vitB2100g", nullable = true)
    private double vitB2100g;

    @Column(name = "vitPP100g", nullable = true)
    private double vitPP100g;

    @Column(name = "vitB6100g", nullable = true)
    private double vitB6100g;

    @Column(name = "presenceHuilePalme", nullable = false)
    private boolean presenceHuilePalme;

    @ManyToOne
    @JoinColumn(name = "Marque_ID")
    private Marque marque;

    @ManyToOne
    @JoinColumn(name = "Categorie_ID")
    private Categorie categories;

    @ManyToMany
    @JoinTable(name = "Prod_Aller",
            joinColumns = @JoinColumn(name = "ID_Prod", referencedColumnName
                    = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_Aller", referencedColumnName
                    = "ID")
    )
    private Set<Allergene> allergenes = new HashSet<>();  // Initialisation de la collection

    @ManyToMany
    @JoinTable(name = "Prod_Ingre",
            joinColumns = @JoinColumn(name = "ID_Prod", referencedColumnName
                    = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_Ingre", referencedColumnName
                    = "ID")
    )
    private Set<Ingredient> ingredients = new HashSet<>();  // Initialisation de la collection

    public Produit() {
    }

    public Produit(String nom) {
        this.nom = nom;
    }

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return double return the graisse100g
     */
    public double getGraisse100g() {
        return graisse100g;
    }

    /**
     * @param graisse100g the graisse100g to set
     */
    public void setGraisse100g(double graisse100g) {
        this.graisse100g = graisse100g;
    }

    /**
     * @return double return the energie100g
     */
    public double getEnergie100g() {
        return energie100g;
    }

    /**
     * @param energie100g the energie100g to set
     */
    public void setEnergie100g(double energie100g) {
        this.energie100g = energie100g;
    }

    /**
     * @return double return the sucres100g
     */
    public double getSucres100g() {
        return sucres100g;
    }

    /**
     * @param sucres100g the sucres100g to set
     */
    public void setSucres100g(double sucres100g) {
        this.sucres100g = sucres100g;
    }

    /**
     * @return double return the fibres100g
     */
    public double getFibres100g() {
        return fibres100g;
    }

    /**
     * @param fibres100g the fibres100g to set
     */
    public void setFibres100g(double fibres100g) {
        this.fibres100g = fibres100g;
    }

    /**
     * @return double return the proteines100g
     */
    public double getProteines100g() {
        return proteines100g;
    }

    /**
     * @param proteines100g the proteines100g to set
     */
    public void setProteines100g(double proteines100g) {
        this.proteines100g = proteines100g;
    }

    /**
     * @return double return the sel100g
     */
    public double getSel100g() {
        return sel100g;
    }

    /**
     * @param sel100g the sel100g to set
     */
    public void setSel100g(double sel100g) {
        this.sel100g = sel100g;
    }

    /**
     * @return double return the vitA100g
     */
    public double getVitA100g() {
        return vitA100g;
    }

    /**
     * @param vitA100g the vitA100g to set
     */
    public void setVitA100g(double vitA100g) {
        this.vitA100g = vitA100g;
    }

    /**
     * @return double return the vitD100g
     */
    public double getVitD100g() {
        return vitD100g;
    }

    /**
     * @param vitD100g the vitD100g to set
     */
    public void setVitD100g(double vitD100g) {
        this.vitD100g = vitD100g;
    }

    /**
     * @return double return the vitE100g
     */
    public double getVitE100g() {
        return vitE100g;
    }

    /**
     * @param vitE100g the vitE100g to set
     */
    public void setVitE100g(double vitE100g) {
        this.vitE100g = vitE100g;
    }

    /**
     * @return double return the vitK100g
     */
    public double getVitK100g() {
        return vitK100g;
    }

    /**
     * @param vitK100g the vitK100g to set
     */
    public void setVitK100g(double vitK100g) {
        this.vitK100g = vitK100g;
    }

    /**
     * @return double return the vitC100g
     */
    public double getVitC100g() {
        return vitC100g;
    }

    /**
     * @param vitC100g the vitC100g to set
     */
    public void setVitC100g(double vitC100g) {
        this.vitC100g = vitC100g;
    }

    /**
     * @return double return the vitB1100g
     */
    public double getVitB1100g() {
        return vitB1100g;
    }

    /**
     * @param vitB1100g the vitB1100g to set
     */
    public void setVitB1100g(double vitB1100g) {
        this.vitB1100g = vitB1100g;
    }

    /**
     * @return double return the vitB2100g
     */
    public double getVitB2100g() {
        return vitB2100g;
    }

    /**
     * @param vitB2100g the vitB2100g to set
     */
    public void setVitB2100g(double vitB2100g) {
        this.vitB2100g = vitB2100g;
    }

    /**
     * @return double return the vitPP100g
     */
    public double getVitPP100g() {
        return vitPP100g;
    }

    /**
     * @param vitPP100g the vitPP100g to set
     */
    public void setVitPP100g(double vitPP100g) {
        this.vitPP100g = vitPP100g;
    }

    /**
     * @return double return the vitB6100g
     */
    public double getVitB6100g() {
        return vitB6100g;
    }

    /**
     * @param vitB6100g the vitB6100g to set
     */
    public void setVitB6100g(double vitB6100g) {
        this.vitB6100g = vitB6100g;
    }

    /**
     * @return Marque return the marque
     */
    public Marque getMarque() {
        return marque;
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    /**
     * @return Categorie return the categories
     */
    public Categorie getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(Categorie categories) {
        this.categories = categories;
    }

    /**
     * @return boolean return the presenceHuilePalme
     */
    public boolean isPresenceHuilePalme() {
        return presenceHuilePalme;
    }

    /**
     * @param presenceHuilePalme the presenceHuilePalme to set
     */
    public void setPresenceHuilePalme(boolean presenceHuilePalme) {
        this.presenceHuilePalme = presenceHuilePalme;
    }

}
