package ArbreAbstrait;

import java.util.ArrayList;

/**
 * Created by cyril on 6/16/17.
 */
public class Bloc extends Instruction {
    private ArrayList<Instruction> instr;

    public Bloc(int lig){
        super(lig);
        instr = new ArrayList<Instruction>();
    }

    public void add(Instruction instruction) {
        this.instr.add(instruction);
    }
}
