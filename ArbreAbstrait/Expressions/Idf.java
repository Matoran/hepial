package ArbreAbstrait.Expressions;

import ArbreAbstrait.Visiteur;
import TDS.Types.Type;
/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Idf
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Idf extends Expression {
    private String nom;
    private Type type;
    private int pile = -1;

    public Idf(String nom, int lig){
        super(lig);
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Idf{" +
                "nom='" + nom + '\'' +
                ", type=" + type +
                '}';
    }

    public int getPile() {
        return pile;
    }

    public void setPile(int pile) {
        this.pile = pile;
    }
}
