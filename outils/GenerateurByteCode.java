package outils;

import ArbreAbstrait.ArbreAbstrait;
import ArbreAbstrait.Arithmetiques.Addition;
import ArbreAbstrait.Arithmetiques.Division;
import ArbreAbstrait.Arithmetiques.Produit;
import ArbreAbstrait.Arithmetiques.Soustraction;
import ArbreAbstrait.Expressions.Idf;
import ArbreAbstrait.Expressions.Nombre;
import ArbreAbstrait.Instructions.*;
import ArbreAbstrait.Relations.*;
import ArbreAbstrait.Visiteur;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by matoran on 6/17/17.
 */
public class GenerateurByteCode implements Visiteur {
    private static StringBuilder cible = new StringBuilder();
    private static GenerateurByteCode ourInstance = new GenerateurByteCode();

    public static GenerateurByteCode getInstance() {
        return ourInstance;
    }

    private int pile = 0;
    private int indexEcrire = -1;

    private GenerateurByteCode() {
    }

    public void generer(ArbreAbstrait arbre) {
        arbre.accepter(this);
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("jasmin.j"));
            bufferedWriter.write(cible.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object visiter(Bloc b) {
        cible.append(".class public Main\n");
        cible.append(".super java/lang/Object\n");
        cible.append(".method public <init>()V\n");
        cible.append("aload_0 ; push this\n");
        cible.append("invokespecial java/lang/Object/<init>()V ; call super\n");
        cible.append("return\n");
        cible.append(".end method\n");
        cible.append(".method public static main([Ljava/lang/String;)V\n");
        cible.append(".limit stack 10\n");
        cible.append(".limit locals 100\n");
        b.getLinstr().accepter(this);
        cible.append("return\n");
        cible.append(".end method\n");
        return null;
    }

    @Override
    public Object visiter(Addition a) {
        a.gauche().accepter(this);
        a.droit().accepter(this);
        cible.append("iadd\n");
        return null;
    }

    @Override
    public Object visiter(Soustraction s) {
        s.gauche().accepter(this);
        s.droit().accepter(this);
        cible.append("isub\n");
        return null;
    }

    @Override
    public Object visiter(Produit p) {
        p.gauche().accepter(this);
        p.droit().accepter(this);
        cible.append("imul\n");
        return null;
    }

    @Override
    public Object visiter(Division d) {
        d.gauche().accepter(this);
        d.droit().accepter(this);
        cible.append("idiv\n");
        return null;
    }

    @Override
    public Object visiter(Nombre n) {
        cible.append("ldc ").append(n.valeur()).append("\n");
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
        a.getSource().accepter(this);

        if (a.getDest().getPile() == -1) {
            a.getDest().setPile(pile++);
        }
        cible.append("istore ").append(a.getDest().getPile()).append("\n");
        indexEcrire = a.getDest().getPile();
        return null;
    }

    @Override
    public Object visiter(Idf i) {
        System.out.println("Idf");
        if (i.getPile() == -1) {
            i.setPile(pile++);
        } else {
            cible.append("iload ").append(i.getPile()).append("\n");
        }
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
        for (Instruction instruction : linstr.getLinstr()) {
            instruction.accepter(this);
        }
        return null;
    }

    @Override
    public Object visiter(Ecrire ecrire) {
        cible.append("getstatic java/lang/System/out Ljava/io/PrintStream;\n");
        cible.append("iload ").append(indexEcrire).append("\n");
        //; invoke println
        cible.append("invokevirtual java/io/PrintStream/println(I)V\n");
        return null;
    }

    @Override
    public Object visiter(Lire lire) {
        return null;
    }
}
