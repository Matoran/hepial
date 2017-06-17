package ArbreAbstrait;

import java.util.ArrayList;

/**
 * Created by matoran on 6/17/17.
 */
public class Linstr implements ArbreAbstrait {
    private ArrayList<Instruction> linstr = new ArrayList<>();

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

    public void add(Instruction instruction) {
        linstr.add(instruction);
    }
}
