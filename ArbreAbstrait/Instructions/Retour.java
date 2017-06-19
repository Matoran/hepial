package ArbreAbstrait.Instructions;


import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Retour
 * Language: Java
 * Date : semestre printemps 2017
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
