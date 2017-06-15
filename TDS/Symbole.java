package TDS;

/**
 * Created by matoran on 6/12/17.
 */
public abstract class Symbole {
    private int ligne;
    protected Symbole(int ligne){
        this.ligne = ligne;
    }


    public int getLigne() {
        return ligne;
    }
}
