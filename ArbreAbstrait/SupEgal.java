package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class SupEgal extends Relation {
    public SupEgal(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    @Override
    public String operateur() {
        return ">=";
    }
}
