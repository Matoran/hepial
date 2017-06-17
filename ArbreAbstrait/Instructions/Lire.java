package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Idf;

/**
 * Created by matoran on 6/17/17.
 */
public class Lire extends Instruction {
    private Idf identifiant;

    public Lire(Idf id, int lig) {
        super(lig);
        identifiant = id;
    }


}
