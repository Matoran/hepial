package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Idf;
import ArbreAbstrait.Visiteur;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Appel
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Appel extends Instruction {
    private Idf idf;

    public Appel(int lig) {
        super(lig);
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }
}
