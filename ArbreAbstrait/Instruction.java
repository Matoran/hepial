package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class Instruction implements ArbreAbstrait {
    private int lig;

    public Instruction(int lig){
        this.lig = lig;
    }

    @Override
    public Object accepter(Visiteur v) {
        return v.visiter(this);
    }

}
