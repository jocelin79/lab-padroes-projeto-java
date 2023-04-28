package org.example.singleton;

/**
 * Singleton "apressado".
 *
 * @author jocelin79
 */

public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
