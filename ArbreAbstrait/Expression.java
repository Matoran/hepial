package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public abstract class Expression implements ArbreAbstrait {
    private int ligne;

    public Expression(int lig) {
        ligne = lig;
    }
}
