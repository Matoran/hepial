package TDS.Entrees;

/**
 * Created by matoran on 6/12/17.
 */
public abstract class Entree {
    private Ident identifiant;

    protected Entree(Ident ident){
        identifiant = ident;
    }

    public Ident getIdent() {
        return identifiant;
    }

    @Override
    public String toString() {
        return identifiant.toString();
    }
}
