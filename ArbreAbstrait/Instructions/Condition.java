package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Condition
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Condition extends Instruction {
    private Expression condition;
    private Linstr alors;
    private Linstr sinon;
    private int valeur;

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

    public void setCondition(int i) {
        valeur = i;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }
}
