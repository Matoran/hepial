package TDS;

/**
 * Created by matoran on 6/16/17.
 */
public class Association {
    private Symbole symbole;
    private int numeroBloc;

    public Association(Symbole s, int numeroBloc) {
        symbole = s;
        this.numeroBloc = numeroBloc;
    }

    public Symbole getSymbole() {
        return symbole;
    }

    public int getNumeroBloc() {
        return numeroBloc;
    }

    @Override
    public String toString() {
        return symbole + " bloc=" + numeroBloc;
    }
}
