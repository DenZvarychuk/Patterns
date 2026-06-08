package org.patterns.singleton.lections;

// Lazy initialisation
// 1 time for synchronised, other times check instance
public class Singleton4 {

    private static volatile Singleton4 instance = null;
    private Singleton4(){}

    public Singleton4 getInstance(){

        if (instance == null) {
            synchronized (this) {
                if (instance == null)
                    instance = new Singleton4();


            }
        }

        return instance;

    }

    public void method1(){}

}
