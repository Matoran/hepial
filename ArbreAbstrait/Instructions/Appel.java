package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Idf;
import ArbreAbstrait.Visiteur;

/**
 * Created by cyril on 6/16/17.
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
