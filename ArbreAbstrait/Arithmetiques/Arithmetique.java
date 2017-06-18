package ArbreAbstrait.Arithmetiques;

import ArbreAbstrait.Expressions.Binaire;
import ArbreAbstrait.Expressions.Expression;
import TDS.Types.Type;

/**
 * Created by cyril on 6/16/17.
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
