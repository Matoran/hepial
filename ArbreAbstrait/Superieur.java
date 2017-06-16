package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class Superieur extends Relation {
    public Superieur(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    @Override
    public String operateur() {
        return ">";
    }
}
