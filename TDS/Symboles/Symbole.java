package TDS.Symboles;

import TDS.Types.Type;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Symbole
 * Language: Java
 * Date : semestre printemps 2017
 */
public abstract class Symbole {
    private int ligne;
    private Type type;

    protected Symbole(int ligne, Type t) {
        this.ligne = ligne;
        type = t;
    }


    public int getLigne() {
        return ligne;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " déclaré à la ligne " + ligne +
                " et de " + type;
    }
}
