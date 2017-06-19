package ArbreAbstrait.Expressions;

import ArbreAbstrait.Visiteur;
import TDS.Types.Type;
import TDS.Types.TypeBooleen;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Booleen
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Booleen extends Expression {
    private boolean val;
    public Booleen(boolean val, int lig) {
        super(lig);
        this.val = val;
    }

    @Override
    public Object accepter(Visiteur v) {
        return null;
    }

    @Override
    public Type getType() {
        return TypeBooleen.getInstance();
    }
}
