package TDS.Types;

import ArbreAbstrait.Expressions.Idf;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: TypeTableau
 * Language: Java
 * Date : semestre printemps 2017
 */
public class TypeTableau extends Type {
    protected Type type;
    protected int[] borneInf;
    protected int[] borneSup;

    public TypeTableau(Idf i, Type t, int[] binf, int[] bsup) {
        type = t;
        borneInf = binf;
        borneSup = bsup;
    }

    @Override
    public boolean estConforme(Type other) {
        return other instanceof TypeTableau;
    }
}
