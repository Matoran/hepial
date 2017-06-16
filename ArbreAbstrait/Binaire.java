package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public abstract class Binaire extends Expression {
    protected Expression operandeGauche; // opérande gauche
    protected Expression operandeDroit; // opérande droit

    // Construire à partir des deux opérandes
    public Binaire (Expression g, Expression d, int lig) {
        super(lig);
        operandeGauche = g;
        operandeDroit = d;
    }

    // consulter l’opérande gauche
    public Expression gauche(){
      return operandeGauche;
    }

    // consulter l’opérande droit
    public Expression droit() {
        return operandeDroit;
    }

    // greffe un nouvel opérande gauche
    public void grefferGauche (Expression exp) {
        operandeGauche = exp;
    }

    // greffe un nouvel opérande droit
    public void grefferDroit (Expression exp) {
        operandeDroit = exp;
    }

    @Override
    public String toString() {
        return "(" + operandeGauche+operateur()+operandeDroit+")";
    }

    public abstract String operateur();
}
