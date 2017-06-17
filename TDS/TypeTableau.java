package TDS;

import ArbreAbstrait.Expressions.Idf;

/**
 * Created by matoran on 6/12/17.
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
