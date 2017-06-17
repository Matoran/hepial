package ArbreAbstrait;

/**
 * Created by matoran on 6/17/17.
 */
public interface Visiteur {

    Object visiter(Bloc b);

    Object visiter(Addition a);

    Object visiter(Soustraction s);

    Object visiter(Nombre n);

    Object visiter(Produit p);

    Object visiter(Division d);

    Object visiter(Egal e);

    Object visiter(Inferieur e);

    Object visiter(InfEgal e);

    Object visiter(Superieur e);

    Object visiter(SupEgal e);

    Object visiter(Different e);

    Object visiter(Affectation a);

    Object visiter(Idf i);

    Object visiter(Condition c);

    Object visiter(Instruction instruction);

    Object visiter(Linstr linstr);
}