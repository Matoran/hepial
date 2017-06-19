package ArbreAbstrait.Arithmetiques;

import ArbreAbstrait.Expressions.Binaire;
import ArbreAbstrait.Expressions.Expression;
import TDS.Types.Type;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Arithmetique
 * Language: Java
 * Date : semestre printemps 2017
 */
public abstract class Arithmetique extends Binaire {
    private Type type;

    public Arithmetique(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    public void setType(Type type) {
        this.type = type;
    }
}
