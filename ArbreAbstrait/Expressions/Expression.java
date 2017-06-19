package ArbreAbstrait.Expressions;

import ArbreAbstrait.ArbreAbstrait;
import TDS.Types.Type;
import outils.AnalyseurSemantique;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Expression
 * Language: Java
 * Date : semestre printemps 2017
 */
public abstract class Expression implements ArbreAbstrait {
    private int ligne;

    public Expression(int lig) {
        ligne = lig;
        System.out.println("création " + this.getClass().getSimpleName() + " " + lig);
    }

    public abstract Type getType();

}
