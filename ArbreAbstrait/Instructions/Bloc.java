package ArbreAbstrait.Instructions;

import java.util.ArrayList;
/**
 * Created by cyril on 6/16/17.
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
}
