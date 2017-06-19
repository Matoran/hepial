package TDS.Types;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Type
 * Language: Java
 * Date : semestre printemps 2017
 */
public abstract class Type {
    public abstract boolean estConforme(Type other);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
