package ArbreAbstrait.Instructions;


import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;

/**
 * Created by cyril on 6/17/17.
 */
public class Retour extends Instruction {
    private Expression expression;

    public Retour(Expression exp, int lig) {
        super(lig);
        this.expression = exp;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }
}
