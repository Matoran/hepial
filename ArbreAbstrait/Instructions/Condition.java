package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Expression;

/**
 * Created by cyril on 6/16/17.
 */
public class Condition extends Instruction {
    private Expression condition;
    private Linstr alors;
    private Linstr sinon;

    public Expression getCondition() {
        return condition;
    }

    public Linstr getAlors() {
        return alors;
    }

    public Linstr getSinon() {
        return sinon;
    }

    public Condition(Expression condition, Linstr alors, Linstr sinon, int lig) {
        super(lig);
        this.condition = condition;
        this.alors = alors;
        this.sinon = sinon;
    }
}
