package ArbreAbstrait.Relations;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;
import TDS.Types.Type;
import TDS.Types.TypeBooleen;
/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Egal
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Egal extends Relation {
    public Egal(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    @Override
    public String operateur() {
        return "==";
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    @Override
    public Type getType() {
        return TypeBooleen.getInstance();
    }
}
