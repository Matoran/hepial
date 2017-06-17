package TDS.Types;

/**
 * Created by matoran on 6/12/17.
 */
public abstract class Type {
    public abstract boolean estConforme(Type other);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
