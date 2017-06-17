package ArbreAbstrait.Arithmetiques;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;
import TDS.Type;
import TDS.TypeEntier;
/**
 * Created by cyril on 6/16/17.
 */
public class Soustraction extends Arithmetique {
    public Soustraction(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    @Override
    public String operateur() {
        return "-";
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    @Override
    public Type getType() {
        return TypeEntier.getInstance();
    }
}
