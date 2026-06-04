package org.patterns.singleton.singletonLections;

// Lazy initialisation
// not realy good for CPU, it takes time to check synchronized every time
public class Singleton3 {

    private static Singleton3 instance = null;

    private Singleton3() {
    }

    public Singleton3 getInstance() {

        synchronized (this) {
            if (instance == null)
                instance = new Singleton3();

            return instance;

        }
    }

    public void method1() {
    }

}
