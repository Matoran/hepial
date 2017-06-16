package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class Nombre extends Expression {
    private int valeur;
    // Creér à partir de la valeur du nombre
    public Nombre (Integer val, int lig) {
        super(lig);
        this.valeur = val.intValue();
    }

    // valeur de l’expression
    public int valeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return ""+valeur;
    }
}
