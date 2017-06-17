package ArbreAbstrait;

import java.util.ArrayList;

/**
 * Created by cyril on 6/16/17.
 */
public class Condition extends Instruction {
    private Expression condition;
    private ArrayList<Instruction> alors;
    private ArrayList<Instruction> sinon;

    public Condition(Expression condition, ArrayList<Instruction> alors, ArrayList<Instruction> sinon, int lig){
        super(lig);
        this.alors = new ArrayList<Instruction>();
        this.sinon = new ArrayList<Instruction>();
        this.condition = condition;
        this.alors = alors;
        this.sinon = sinon;
    }
}
