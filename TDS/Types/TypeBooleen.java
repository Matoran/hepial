package TDS.Types;

/**
 * Created by matoran on 6/15/17.
 */
public class TypeBooleen extends Type {

    private static TypeBooleen ourInstance = new TypeBooleen();

    public static TypeBooleen getInstance() {
        return ourInstance;
    }

    private TypeBooleen() {
    }

    @Override
    public boolean estConforme(Type other) {
        return other instanceof TypeBooleen;
    }
}
