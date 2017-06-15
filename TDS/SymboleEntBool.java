package TDS;

/**
 * Created by matoran on 6/12/17.
 */
public class SymboleEntBool extends SymboleVariable {
    private Type type;

    public SymboleEntBool(int ligne, Type t) {
        super(ligne);
        type = t;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
