package ArbreAbstrait;

import java.util.ArrayList;

/**
 * Created by cyril on 6/16/17.
 */
public class Pour extends Instruction {
    private Idf idf;
    private Expression borneInf;
    private Expression borneSup;
    private ArrayList<Instruction> instr;

    public Pour(Idf id, Expression ecDebut, Expression ecFin, ArrayList<Instruction> faire){
        instr = new ArrayList<Instruction>();
        idf = id;
        borneInf = ecDebut;
        borneSup = ecFin;
        instr = faire;
    }

}
