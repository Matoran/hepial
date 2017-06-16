package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class Affectation extends Instruction{
    private Expression source;
    private Expression dest;

    public Affectation(Expression dest, Expression source) {
        this.source = source;
        this.dest = dest;
    }
}
