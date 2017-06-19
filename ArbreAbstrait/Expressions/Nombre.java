package ArbreAbstrait.Expressions;

import ArbreAbstrait.Visiteur;
import TDS.Types.Type;
import TDS.Types.TypeEntier;
/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Nombre
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Nombre extends Expression {
    private int valeur;
    private Type type;

    // Creér à partir de la valeur du nombre
    public Nombre (Integer val, int lig) {
        super(lig);
        this.valeur = val;
    }

    // valeur de l’expression
    public int valeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return ""+valeur;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    @Override
    public Type getType(){
        return this.type;
    }

    public void setType(Type type){
        this.type = type;
    }
}
