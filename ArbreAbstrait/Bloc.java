package ArbreAbstrait;

import java.util.ArrayList;

/**
 * Created by cyril on 6/16/17.
 */
public class Bloc extends Instruction {
    private ArrayList<Instruction> instr = new ArrayList<>();

    public void add(Instruction instruction) {
        instr.add(instruction);
    }
}
