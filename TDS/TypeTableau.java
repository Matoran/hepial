package TDS;

/**
 * Created by matoran on 6/12/17.
 */
public class TypeTableau extends Type {
    protected Type type;
    protected int bikek;
    protected int[] borneinf;
    protected int[] borneSup;
    protected int[] enjambees;

    public TypeTableau(int ligne) {

    }

    @Override
    public boolean estConforme(Type other) {
        return other instanceof TypeTableau;
    }
}
