package ArbreAbstrait;

/**
 * Created by cyril on 6/16/17.
 */
public class Idf extends Expression {
    private String nom;

    public Idf(String nom, int lig){
        super(lig);
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }
}
