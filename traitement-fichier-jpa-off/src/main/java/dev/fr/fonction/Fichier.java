package dev.fr.fonction;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.fr.entity.Marque;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Fichier {

    // Création de l'EntityManagerFactory à partir du fichier persistence.xml
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_essai");

    // Création de l'EntityManager
    EntityManager em = emf.createEntityManager();

    EntityTransaction transaction = em.getTransaction();

    public List<String> getAllMarqueNamesSplit() {
        // Requête JPQL pour récupérer tous les noms des marques
        TypedQuery<String> query = em.createQuery("SELECT m.nom FROM Marque m", String.class);
        List<String> rawMarqueNames = query.getResultList();

        // Liste pour stocker les noms après split
        List<String> marqueNames = new ArrayList<>();

        // Parcourir chaque nom et effectuer le split
        for (String rawName : rawMarqueNames) {
            if (rawName != null && !rawName.isEmpty()) {
                String[] splitNames = rawName.split(",");
                marqueNames.addAll(Arrays.asList(splitNames)); // Ajouter le nom à la liste
            }
        }

        return marqueNames;
    }

    public void marqueAjout(String s) {

        // Diviser la chaîne en une liste de noms de marques
        String[] separated = s.split(",");
        transaction.begin();

        for (String string : separated) {
            string = Normalizer.normalize(string, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");
            if (!getAllMarqueNamesSplit().contains(string)) {
                // Si la marque n'existe pas, on l'ajoute
                Marque m = new Marque(string);
                getAllMarqueNamesSplit().add(string);
                em.persist(m);
            }
        }

        transaction.commit();
    }

}
