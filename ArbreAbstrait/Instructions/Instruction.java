package ArbreAbstrait.Instructions;

import ArbreAbstrait.ArbreAbstrait;
import ArbreAbstrait.Visiteur;

/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Instructin
 * Language: Java
 * Date : semestre printemps 2017
 */
public abstract class Instruction implements ArbreAbstrait {
    private int lig;

    public Instruction(int lig) {
        this.lig = lig;
        System.out.println("création " + this.getClass().getSimpleName() + " " + lig);

    }


}
