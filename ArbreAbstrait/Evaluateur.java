package ArbreAbstrait;

import TDS.Type;
import TDS.TypeBooleen;

/**
 * Created by matoran on 6/17/17.
 */
public class Evaluateur implements Visiteur {
    private static Evaluateur ourInstance = new Evaluateur();

    public static Evaluateur getInstance() {
        return ourInstance;
    }

    private Evaluateur() {
    }

    @Override
    public Object visiter(Nombre n) {
        return n.valeur();
    } // visiter

    @Override
    public Object visiter(Addition a) {
        Object valG = a.gauche().accepter(this);
        if (valG == null) return null;
        Object valD = a.droit().accepter(this);
        if (valD == null) return null;
        int g = ((Integer) valG);
        int d = ((Integer) valD);
        return g + d;
    } // visiter

    @Override
    public Object visiter(Soustraction s) {
        Object valG = s.gauche().accepter(this);
        if (valG == null) return null;
        Object valD = s.droit().accepter(this);
        if (valD == null) return null;
        int g = ((Integer) valG);
        int d = ((Integer) valD);
        return g - d;
    }

    @Override
    public Object visiter(Produit p) {
        Object valG = p.gauche().accepter(this);
        if (valG == null) return null;
        Object valD = p.droit().accepter(this);
        if (valD == null) return null;
        int g = ((Integer) valG);
        int d = ((Integer) valD);
        return g * d;
    }

    @Override
    public Object visiter(Division div) {
        Object valG = div.gauche().accepter(this);
        if (valG == null) return null;
        Object valD = div.droit().accepter(this);
        if (valD == null) return null;
        int g = ((Integer) valG);
        int d = ((Integer) valD);
        return g / d;
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

    public Object visiter(Idf i) {
        return null;
    } // visiter

    private static String eb = "Expression booléenne attendue";

    @Override
    public Object visiter(Condition c) {
        Object v = c.getCondition().accepter(this);
        if (v != null)
            c.setValeurCondition((Integer) v);
        else {
            c.getCondition().accepter(this);
            if (c.getCondition().type() != TypeBooleen.getInstance())
                erreur(c, eb);
        } // if
        c.getAlors().forEach(e -> e.accepter(this));
        c.getSinon().forEach(e -> e.accepter(this));
        return null;
    }

    @Override
    public Object visiter(Bloc b) {
        return null;
    }

    private static String ncf = "Source et dest. non conformes";

    @Override
    public Object visiter(Affectation a) {
        a.getDest().accepter(this);
        Type typeDest = a.getDest().type();
        Object v = a.getSource().accepter(Evaluateur.getInstance());
        if (v != null)
            a.setSource(new Nombre((Integer) v, ligne()));
        a.getSource().accepter(this);
        Type typeSource = a.getSource().type();
        if (!(typeSource.estConforme(typeDest)))
            erreur(a, ncf);
        else
            a.setType(typeDest);
        return null;
    }

} // class Evaluateur