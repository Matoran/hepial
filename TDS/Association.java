package TDS;

import TDS.Symboles.Symbole;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Association
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Association {
    private Symbole symbole;
    private int numeroBloc;

    public Association(Symbole s, int numeroBloc) {
        symbole = s;
        this.numeroBloc = numeroBloc;
    }

    public Symbole getSymbole() {
        return symbole;
    }

    public int getNumeroBloc() {
        return numeroBloc;
    }

    @Override
    public String toString() {
        return symbole + " bloc=" + numeroBloc;
    }
}
