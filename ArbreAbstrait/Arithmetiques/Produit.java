package ArbreAbstrait.Arithmetiques;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;
import TDS.Types.Type;
import TDS.Types.TypeEntier;
/**
 * Created by cyril on 6/16/17.
 */
public class Produit extends Arithmetique {
    public Produit(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    @Override
    public String operateur() {
        return "*";
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
