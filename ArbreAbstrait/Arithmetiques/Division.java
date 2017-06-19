package ArbreAbstrait.Arithmetiques;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;
import TDS.Types.Type;
import TDS.Types.TypeEntier;
/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Division
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Division extends Arithmetique {
    public Division(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    @Override
    public String operateur() {
        return "/";
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
