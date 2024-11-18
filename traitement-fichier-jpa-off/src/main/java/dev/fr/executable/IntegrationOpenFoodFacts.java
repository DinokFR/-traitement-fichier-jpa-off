package dev.fr.executable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import dev.fr.entity.Produit;
import dev.fr.fonction.Fichier;

public class IntegrationOpenFoodFacts {
    

    private Produit parserLigne(String ligne) {
        // Implémentez le parsing pour convertir une ligne en objet Produit
        return new Produit();
    }

    public static void main(String[] args) { 
        Fichier f = new Fichier();

        try {
            FileReader fileReader = new FileReader(new File("C:\\Users\\flori\\Documents\\temp/open-food-facts.csv"));
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] separated = line.split("\\|");
                f.marqueAjout(separated[1]);
            }
            reader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
