package TDS;

/**
 * Created by matoran on 6/12/17.
 */
public abstract class Entree {
    protected Entree(Ident ident){

    }

    public Ident ident(){
        return new Ident();
    }
}
