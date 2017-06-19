package ArbreAbstrait.Instructions;

import ArbreAbstrait.Visiteur;

import java.util.ArrayList;
/**
 * @authors LOPES Marco, ISELI Cyril
 * Purpose: Linstr
 * Language: Java
 * Date : semestre printemps 2017
 */
public class Linstr extends Instruction {
    private ArrayList<Instruction> linstr = new ArrayList<>();

    public Linstr(int ligne) {
        super(ligne);
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    public void add(Instruction instruction) {
        linstr.add(instruction);
    }

    public ArrayList<Instruction> getLinstr() {
        return linstr;
    }
}
