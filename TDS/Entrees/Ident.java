package TDS.Entrees;

/**
 * Created by matoran on 6/12/17.
 */
public class Ident {
    private String identifiant;

    public Ident(String identifiant) {
        this.identifiant = identifiant;
    }

    @Override
    public String toString() {
        return identifiant;
    }

    public String getIdent() {
        return identifiant;
    }

    public void setIdent(String identifiant) {
        this.identifiant = identifiant;
    }
}
