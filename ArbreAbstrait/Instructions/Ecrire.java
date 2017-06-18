package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;

/**
 * Created by cyril on 6/17/17.
 */
public class Ecrire extends Instruction {
    private String texte;
    private Expression expr;


    public Ecrire(String texte, int lig) {
        super(lig);
        this.texte = texte;
    }

    public Ecrire(Expression expr, int lig){
        super(lig);
        this.expr = expr;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }
}
