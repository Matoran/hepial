package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class Division extends Arithmetique {
    public Division(Expression g, Expression d, int lig) {
        super(g, d, lig);
    }

    @Override
    public String operateur() {
        return "/";
    }
}
