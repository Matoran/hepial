package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class Different extends Relation {
    public Different(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    @Override
    public String operateur() {
        return "<>";
    }
}
