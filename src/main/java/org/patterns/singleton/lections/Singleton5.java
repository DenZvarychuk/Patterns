package org.patterns.singleton.lections;

// Lazy initialisation
// 1 time for synchronised, other times check instance
// lock inside class
public class Singleton5 {

    private static Singleton5 instance = null;
    private Object lock = new Object();

    private Singleton5(){}

    public Singleton5 getInstance(){

        if (instance == null) {
            synchronized (lock) {
                if (instance == null)
                    instance = new Singleton5();


            }
        }

        return instance;

    }

    public void method1(){}

}
