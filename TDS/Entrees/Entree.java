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

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Entree))
            return false;
        Entree entree = (Entree)o;
        return identifiant.getIdent().equals(entree.getIdent().getIdent());
    }

    @Override
    public int hashCode() {
        return identifiant.getIdent().hashCode();
    }
}
