package ArbreAbstrait.Expressions;

import ArbreAbstrait.Visiteur;
import TDS.Type;
/**
 * Created by cyril on 6/16/17.
 */
public class Idf extends Expression {
    private String nom;
    private Type type;

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
}