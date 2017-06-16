package TDS;

import java.util.*;

public class TDS {
    private Stack<Integer> pile;
    private HashMap<Entree, Stack<Association>> dico;
    private int numeroBloc = -1;
    private static TDS instance = new TDS();

    public static TDS getInstance() {
        return instance;
    }

    public TDS() {
        pile = new Stack<>();
        dico = new HashMap<>();
    }

    public void entreeBloc() {
        numeroBloc++;
        pile.push(numeroBloc);
    }

    public void sortieBloc() {
        pile.pop();

    }

    public void ajouter(Entree e, Symbole s) {
        Stack<Association> ls = dico.get(e);
        if (ls == null) {
            ls = new Stack<>();
            ls.push(new Association(s, numeroBloc));
            dico.put(e, ls);
        } else {
            Association premier = ls.peek();
            if (premier.getNumeroBloc() == numeroBloc) {
                System.out.println("erreur double déclaration");
                //FlotErreurs.getInstance().add(s.getLigne(), ErreurSemantique.doubleDecl(e, s.getLigne()));
            } else {
                ls.push(new Association(s, numeroBloc));
            }
        }
    }

    public Symbole identifier(Entree e) {
        Stack<Association> ls = dico.get(e);
        if (ls == null)
            return null;
        int indicePile = pile.size() - 1;
        int indiceLs = ls.size() - 1;
        boolean fin = false;
        Symbole s = null;
        int premListe, premPile;
        Association assoc;
        while (!fin && indicePile != -1 && indiceLs != -1) {
            assoc = ls.get(indiceLs);
            premListe = assoc.getNumeroBloc();
            premPile = pile.get(indicePile);
            if (premListe == premPile) {
                s = assoc.getSymbole();
                fin = true;
            } else if (premListe < premPile) {
                indiceLs--;
            } else {
                indicePile--;
            }
        }
        return s;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        dico.forEach((e, s) -> {
            sb.append(e).append(" est un ");
            s.forEach(sb::append);
            sb.append("\n");
        });
        return sb.toString();
    }
}