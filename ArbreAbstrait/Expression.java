package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public abstract class Expression extends ArbreAbstrait {
    private int ligne;

    public Expression(int lig) {
        ligne = lig;
    }
}
