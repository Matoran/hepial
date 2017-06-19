package TDS.Types;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: TypeBooleen
 * Language: Java
 * Date : semestre printemps 2017
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
