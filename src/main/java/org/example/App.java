package org.example;

import org.example.singleton.SingletonEager;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // Testes relacionados ao Design Pattern Singleton:
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        // Testes relacionados ao Design Pattern Strategy:
        
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);
        
        robo.mover();
        robo.mover():
    }
}
