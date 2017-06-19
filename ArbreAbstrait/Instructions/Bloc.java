package ArbreAbstrait.Instructions;

import ArbreAbstrait.Visiteur;

import java.util.ArrayList;
/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Bloc
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Bloc extends Instruction {
    private Linstr linstr;

    public Bloc(int lig){
        super(lig);
        linstr = new Linstr(lig);
    }

    public void add(Instruction instruction) {
        this.linstr.add(instruction);
    }

    public Linstr getLinstr() {
        return linstr;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }
}
