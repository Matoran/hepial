package ArbreAbstrait.Expressions;

import ArbreAbstrait.ArbreAbstrait;
import TDS.Types.Type;
/**
 * Created by cyril on 6/16/17.
 */
public abstract class Expression implements ArbreAbstrait {
    private int ligne;

    public Expression(int lig) {
        ligne = lig;
        System.out.println("création " + this.getClass().getSimpleName() + " " + lig);
    }

    public abstract Type getType();
}
