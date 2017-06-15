package TDS;


import java.util.*;

public class TDS {
    public Stack<HashMap<Entree, Symbole>> pile;
    public HashMap<Entree, Symbole> dico;
    private int numeroBloc = -1;
    private static TDS instance = new TDS();

    int valeurPileActuelle = 0;

    public static TDS getInstance() {
        return instance;
    }

    public TDS() {
        pile = new Stack<HashMap<Entree, Symbole>>();
        dico = new HashMap<Entree, Symbole>();
    }

    public void entreeBloc() {
        HashMap<Entree, Symbole> newBloc = new HashMap<Entree, Symbole>();
        pile.push(dico);
        dico = newBloc;
    }

    public void sortieBloc() {
        dico = pile.pop();
    }

    public void ajouter(Entree e, Symbole s) {
        dico.put(e, s);
    }

    public Symbole identifier(Entree e) {
        return null;
        //return this.bloc.get(e);
    }

    public Symbole getSymbole(Entree e) {
        return dico.get(e);
    }

}