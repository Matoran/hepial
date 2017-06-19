package outils;

import ArbreAbstrait.ArbreAbstrait;
import javafx.util.Pair;

import java.util.ArrayList;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Erreurs
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Erreurs {
    private static ArrayList<Pair<ArbreAbstrait, String>> erreurs = new ArrayList<>();

    public static void ajouter(ArbreAbstrait object, String erreur) {
        erreurs.add(new Pair<>(object, erreur));
    }

    public static void afficher() {
        System.out.println(erreurs);
    }
}
