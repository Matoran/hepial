package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Idf;
import ArbreAbstrait.Visiteur;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Lire
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Lire extends Instruction {
    private Idf identifiant;

    public Lire(Idf id, int lig) {
        super(lig);
        identifiant = id;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

}
