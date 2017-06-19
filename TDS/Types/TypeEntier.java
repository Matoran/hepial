package TDS.Types;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: TypeEntier
 * Language: Java
 * Date : semestre printemps 2017
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
