package TDS.Entrees;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Ident
 * Language: Java
 * Date : semestre printemps 2017
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
