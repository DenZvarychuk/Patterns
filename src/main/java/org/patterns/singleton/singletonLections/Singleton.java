package org.patterns.singleton.singletonLections;

// not ok for multithreading
// heavy
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();
    private Singleton(){}

    public Singleton getInstance(){
        return INSTANCE;
    }

    public void method1(){}

}
