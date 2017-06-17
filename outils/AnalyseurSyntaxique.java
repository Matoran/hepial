package outils;

import ArbreAbstrait.ArbreAbstrait;
import ArbreAbstrait.Instructions.Affectation;

/**
 * Created by matoran on 6/17/17.
 */
public class AnalyseurSyntaxique {
    private static AnalyseurSyntaxique ourInstance = new AnalyseurSyntaxique();

    public static AnalyseurSyntaxique getInstance() {
        return ourInstance;
    }

    private AnalyseurSyntaxique() {
    }


    public void controler(Affectation affectation) {

    }

    public void controler(ArbreAbstrait arbreAbstrait) {

    }
}
