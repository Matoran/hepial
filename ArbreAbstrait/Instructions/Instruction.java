package ArbreAbstrait.Instructions;

import ArbreAbstrait.ArbreAbstrait;
import ArbreAbstrait.Visiteur;

/**
 * Created by cyril on 6/16/17.
 */
public class Instruction implements ArbreAbstrait {
    private int lig;

    public Instruction(int lig){
        this.lig = lig;
        System.out.println("création " + this.getClass().getSimpleName() + " " + lig);
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

}
