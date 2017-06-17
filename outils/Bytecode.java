package outils;

/**
 * Created by matoran on 6/17/17.
 */
public class Bytecode {
    private static Bytecode ourInstance = new Bytecode();

    public static Bytecode getInstance() {
        return ourInstance;
    }

    private Bytecode() {
    }
}
