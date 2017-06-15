package TDS;

/**
 * Created by matoran on 6/12/17.
 */
public class SymboleTableau extends SymboleVariable {
    private Type type;
    protected SymboleTableau(int ligne, Type t) {
        super(ligne);
        type = t;
    }

    public Type getType(){
        return type;
    }

    public String toString(){
        return "yolo";
    }
}
