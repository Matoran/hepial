package TDS;

/**
 * Created by matoran on 6/12/17.
 */
public class TypeEntier extends Type {
    @Override
    public boolean estConforme(Type other) {
        return other instanceof TypeEntier;
    }
}
