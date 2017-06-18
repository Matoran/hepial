package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;

/**
 * Created by cyril on 6/16/17.
 */
public class AppelQualifie extends Appel {
    private Expression receveur;

    public AppelQualifie(int lig) {
        super(lig);
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }
}
