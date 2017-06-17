package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class Affectation extends Instruction{
    private Expression source;
    private Idf dest;

    public Affectation(Idf dest, Expression source, int lig) {
        super(lig);
        this.source = source;
        this.dest = dest;
    }
}
