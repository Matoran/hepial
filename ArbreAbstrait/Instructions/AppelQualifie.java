package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Expression;
/**
 * Created by cyril on 6/16/17.
 */
public class AppelQualifie extends Appel {
    private Expression receveur;

    public AppelQualifie(int lig) {
        super(lig);
    }
}
