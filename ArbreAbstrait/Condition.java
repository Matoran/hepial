package ArbreAbstrait;

import java.util.ArrayList;

/**
 * Created by cyril on 6/16/17.
 */
public class Condition extends Instruction {
    private Expression condition;
    private ArrayList<Instruction> alors;
    private ArrayList<Instruction> sinon;
}
