package outils;

import ArbreAbstrait.ArbreAbstrait;
import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Created by matoran on 6/17/17.
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
