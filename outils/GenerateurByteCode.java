package outils;

import ArbreAbstrait.Arithmetiques.Addition;
import ArbreAbstrait.Arithmetiques.Division;
import ArbreAbstrait.Arithmetiques.Produit;
import ArbreAbstrait.Arithmetiques.Soustraction;
import ArbreAbstrait.Expressions.Idf;
import ArbreAbstrait.Expressions.Nombre;
import ArbreAbstrait.Instructions.*;
import ArbreAbstrait.Relations.*;
import ArbreAbstrait.Visiteur;

/**
 * Created by matoran on 6/17/17.
 */
public class GenerateurByteCode implements Visiteur {
    private static StringBuilder cible = new StringBuilder();
    private static GenerateurByteCode ourInstance = new GenerateurByteCode();

    public static GenerateurByteCode getInstance() {
        return ourInstance;
    }

    private GenerateurByteCode() {
    }

    @Override
    public Object visiter(Bloc b) {
        // Header
        cible.append(".class public Main\n");
        cible.append(".super java/lang/Object\n");

        //; default constructor
        cible.append(".method public <init>()V\n");
        cible.append("aload_0 ; push this\n");
        cible.append("invokespecial java/lang/Object/<init>()V ; call super\n");
        cible.append("return\n");
        cible.append(".end method\n");

        //; declare a new method
        cible.append(".method public static main([Ljava/lang/String;)V\n");

        //; allocate stack big enough to hold all items
        cible.append(".limit stack 10\n");
        cible.append(".limit locals 100\n");

        for (int i = 0; i < b.getLinstr().size(); i++) {
            b.getLinstr().get(i).accepter(this);
        }

        //; terminate main
        cible.append("return\n");

        cible.append(".end method\n");
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

    @Override
    public Object visiter(Nombre n) {
        return null;
    }

    @Override
    public Object visiter(Produit p) {
        return null;
    }

    @Override
    public Object visiter(Division d) {
        return null;
    }

    @Override
    public Object visiter(Egal e) {
        return null;
    }

    @Override
    public Object visiter(Inferieur e) {
        return null;
    }

    @Override
    public Object visiter(InfEgal e) {
        return null;
    }

    @Override
    public Object visiter(Superieur e) {
        return null;
    }

    @Override
    public Object visiter(SupEgal e) {
        return null;
    }

    @Override
    public Object visiter(Different e) {
        return null;
    }

    @Override
    public Object visiter(Affectation a) {
        // code cible qui calcule la source
        a.getSource().accepter(this);
        // code cible de l’affectation
        /*int numRec = a.numeroReceveur();
        if (numRec <= 3)
            cible.append(" istore_ ").append(numRec).append('\n');
        else
            cible.append(" istore ").append(numRec).append('\n');*/
        return null;
    }

    @Override
    public Object visiter(Idf i) {
        return null;
    }

    @Override
    public Object visiter(Condition c) {
        return null;
    }

    @Override
    public Object visiter(Instruction instruction) {
        return null;
    }

    @Override
    public Object visiter(Linstr linstr) {
        return null;
    }
}
