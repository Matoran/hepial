package ArbreAbstrait.Relations;

import ArbreAbstrait.Expressions.Binaire;
import ArbreAbstrait.Expressions.Expression;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Relation
 * Language: Java
 * Date : semestre printemps 2017
 */
public abstract class Relation extends Binaire {
    public Relation(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }
}
