package ArbreAbstrait.Instructions;


import ArbreAbstrait.Expressions.Expression;

/**
 * Created by cyril on 6/17/17.
 */
public class Retour extends Instruction {
    private Expression expression;

    public Retour(Expression exp, int lig) {
        super(lig);
        this.expression = exp;
    }
}
