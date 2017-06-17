package ArbreAbstrait.Instructions;

import ArbreAbstrait.ArbreAbstrait;
import ArbreAbstrait.Visiteur;

import java.util.ArrayList;
/**
 * Created by matoran on 6/17/17.
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
}
