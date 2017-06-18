package outils;

import ArbreAbstrait.Instructions.Bloc;

/**
 * Created by matoran on 6/17/17.
 */
public class AnalyseurSemantique {
    private static AnalyseurSemantique ourInstance = new AnalyseurSemantique();

    public static AnalyseurSemantique getInstance() {
        return ourInstance;
    }

    private AnalyseurSemantique() {
    }

    public void analyse(Bloc bloc) {

    }


}
