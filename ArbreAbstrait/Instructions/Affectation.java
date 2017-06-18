package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Expressions.Idf;

/**
 * Created by cyril on 6/16/17.
 */
public class Affectation extends Instruction {
    private Expression source;
    private Idf dest;

    public Affectation(Idf dest, Expression source, int lig) {
        super(lig);
        this.source = source;
        this.dest = dest;
    }

    public Expression getSource() {
        return source;
    }

    public Idf getDest() {
        return dest;
    }

    public void setSource(Expression source) {
        this.source = source;
    }

    public void setDest(Idf dest) {
        this.dest = dest;
    }
}
