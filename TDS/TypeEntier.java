package TDS;

/**
 * Created by matoran on 6/15/17.
 */
public class TypeEntier extends Type {
    private static TypeEntier ourInstance = new TypeEntier();

    public static TypeEntier getInstance() {
        return ourInstance;
    }

    private TypeEntier() {
    }

    @Override
    public boolean estConforme(Type other) {
        return other instanceof TypeEntier;
    }
}
