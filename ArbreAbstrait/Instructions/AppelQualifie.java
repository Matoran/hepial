package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Visiteur;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: AppelQualifie
 * Language: Java
 * Date : semestre printemps 2017
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
