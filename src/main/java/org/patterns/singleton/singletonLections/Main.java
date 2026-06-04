package org.patterns.singleton.singletonLections;

// Singleton pattern - Main class for testing different singleton implementations
// Singleton - antipattern?
// has issues with mock (can not be inherited) (can use mock via interfaces)
// can be used for pool connection to BD

public class Main {

    public static void main(String[] args) {

        System.out.println(Singleton7.FIRST.getClass().getName());
        // output anonymous class - org.patterns.singleton.singletonLections.Singleton7$1

        System.out.println(Singleton7.FIRST.getClass().getSuperclass());
        // output singleton class - class org.patterns.singleton.singletonLections.Singleton7
        // overrided in FIRST declaration

        // - - - - - - - - - - - - -

        Singleton8 singleton8 = Singleton8.getInstance();

    }
}

