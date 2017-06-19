package ArbreAbstrait.Instructions;

import ArbreAbstrait.Expressions.Expression;
import ArbreAbstrait.Expressions.Idf;
import ArbreAbstrait.Visiteur;

import java.util.ArrayList;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Pour
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Pour extends Instruction {
    private Idf idf;
    private Expression borneInf;
    private Expression borneSup;
    private Linstr instr;

    public Pour(Idf id, Expression ecDebut, Expression ecFin, Linstr faire, int lig) {
        super(lig);
        idf = id;
        borneInf = ecDebut;
        borneSup = ecFin;
        instr = faire;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

}
