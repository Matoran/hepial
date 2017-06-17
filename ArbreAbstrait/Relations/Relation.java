package ArbreAbstrait.Relations;

import ArbreAbstrait.Expressions.Binaire;
import ArbreAbstrait.Expressions.Expression;

/**
 * Created by cyril on 6/16/17.
 */
public abstract class Relation extends Binaire {
    public Relation(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }
}
