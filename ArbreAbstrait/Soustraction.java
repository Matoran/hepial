package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class Soustraction extends Arithmetique {
    public Soustraction(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    @Override
    public String operateur() {
        return "-";
    }
}
