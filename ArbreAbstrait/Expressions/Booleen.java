package ArbreAbstrait.Expressions;

import ArbreAbstrait.Visiteur;
import TDS.Types.Type;
import TDS.Types.TypeBooleen;

/**
 * Created by cyril on 6/18/17.
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
