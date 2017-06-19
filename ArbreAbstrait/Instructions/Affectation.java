package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Expressions.Idf;
import ArbreAbstrait.Visiteur;
import TDS.Types.Type;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Affectation
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Affectation extends Instruction {
    private Expression source;
    private Idf dest;
    private Type type;

    public Affectation(Idf dest, Expression source, int lig) {
        super(lig);
        this.source = source;
        this.dest = dest;
    }

    public Expression getSource() {
        return this.source;
    }

    public Idf getDest() {
        return this.dest;
    }

    public void setSource(Expression source) {
        this.source = source;
    }

    public void setDest(Idf dest) {
        this.dest = dest;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType(){
        return this.type;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    @Override
    public String toString() {
        return "Affectation{" +
                "source=" + source +
                ", dest=" + dest +
                ", type=" + type +
                '}';
    }
}
