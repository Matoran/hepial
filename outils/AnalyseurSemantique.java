package outils;

import ArbreAbstrait.ArbreAbstrait;
import ArbreAbstrait.Arithmetiques.*;
import ArbreAbstrait.Evaluateur;
import ArbreAbstrait.Expressions.*;
import ArbreAbstrait.Instructions.*;
import ArbreAbstrait.Relations.*;
import ArbreAbstrait.Visiteur;
import TDS.Entrees.Entree;
import TDS.Entrees.EntreeEntBool;
import TDS.Entrees.Ident;
import TDS.Symboles.Symbole;
import TDS.Types.Type;
import TDS.Types.TypeBooleen;
import TDS.*;
import TDS.Types.TypeEntier;

import java.util.ArrayList;

/**
 * Created by matoran on 6/17/17.
 */
public class AnalyseurSemantique implements Visiteur {
    private static AnalyseurSemantique ourInstance = new AnalyseurSemantique();

    public static AnalyseurSemantique getInstance() {
        return ourInstance;
    }

    private AnalyseurSemantique() {
    }

    public void analyse(ArbreAbstrait arbre){
        System.out.println("Debut arbre");
        System.out.println(arbre.getClass().getSimpleName());
        arbre.accepter(this);
    }

    public Object visiter(Bloc bloc) {
        System.out.println("Debut bloc");
        bloc.getLinstr().accepter(this);
        return null;
    }

    @Override
    public Object visiter(Addition a) {
        return null;
    }

    @Override
    public Object visiter(Soustraction s) {
        return null;
    }

    public Object visiter(Affectation a) {
        System.out.println("Debut affectation");
        a.getDest().accepter(this);
        Type typeDest = a.getDest().getType();
        Object v = a.getSource().accepter(Evaluateur.getInstance());
        if (v != null)
            a.setSource(new Nombre( (Integer)v, 1 ) );

        a.getSource().accepter(this);
        Type typeSource = a.getSource().getType();
        System.out.println(typeSource + "  " + typeDest);
        if(typeSource != null && typeDest != null) {
            if (!(typeSource.estConforme(typeDest)))
                Erreurs.ajouter(a, "Erreur affectation sémantique");
            else
                a.setType(typeDest);
        }else{
            System.out.println(a + "Erreur affectation les types ne sont pas conforme");
        }
        return null;
    }

    private static String eb = "Expression booleen attendue";
    public Object visiter (Condition c) {
        System.out.println("Debut Condition");
        Object v = c.getCondition().accepter(Evaluateur.getInstance());
        if (v != null)
            c.setCondition((Integer) v);
        else {
            c.getCondition().accepter(this);
            if (c.getCondition().getType() != TypeBooleen.getInstance())
                System.out.println(c + eb);
        }
        c.getAlors().accepter(this);
        c.getSinon().accepter(this);
        return null;
    }

    @Override
    public Object visiter(Instruction instruction) {
        return null;
    }

    @Override
    public Object visiter(Linstr linstr) {
        for (Instruction instruction : linstr.getLinstr()) {
            instruction.accepter(this);
        }
        return null;
    }

    private static String nd = "Identificateur non d ́eclare ́";
    public Object visiter (Idf i) {
        Symbole symb = TDS.getInstance().getSymbole(new EntreeEntBool(new Ident(i.getNom())));
        if (symb == null){
            System.out.println(i + nd);
        }else{
            i.setType(symb.getType());
        }
        return null;
    }

    public Object visiter (Nombre n) {
        n.setType( TypeEntier.getInstance());
        return null;
    }

    public void verifierBinaire(Binaire b) {
        b.gauche().accepter(this);
        b.droit().accepter(this);
        if(b.gauche().getType() == null || b.droit().getType() == null) {
            System.out.println("operandes null " + b.droit() + " " + b.gauche());
        }else if (b.gauche().getType() != b.droit().getType()) {
            System.out.println("les opérandes n'ont pas le même type");
        }
    }

    @Override
    public Object visiter(Produit p) {
        verifierBinaire(p);
        return null;
    }

    @Override
    public Object visiter(Division d) {
        verifierBinaire(d);
        return null;
    }

    @Override
    public Object visiter(Egal e) {
        verifierBinaire(e);
        return null;
    }

    @Override
    public Object visiter(Inferieur e) {
        verifierBinaire(e);
        return null;
    }

    @Override
    public Object visiter(InfEgal e) {
        verifierBinaire(e);
        return null;
    }

    @Override
    public Object visiter(Superieur e) {
        verifierBinaire(e);
        return null;
    }

    @Override
    public Object visiter(SupEgal e) {
        verifierBinaire(e);
        return null;
    }

    @Override
    public Object visiter(Different e) {
        return null;
    }

    private static String ti = "Typage incorrect";
    public Object visiter (Arithmetique a) {
        a.gauche().accepter(this);
        Type tg = a.gauche().getType();
        a.droit().accepter(this);
        Type td = a.droit().getType();
        if (tg.estConforme(td))
            a.setType (tg);
        else
            System.out.println(a + ti);
        return null;
    } // visiter;


}
