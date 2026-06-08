package org.patterns.singleton.lections;

// lazy initialization + Holder
// thread save
// no double checks
// class loading initialization
// JVM guarantee atomic operation and thread save withoud synchronization
// serialisation can have problems with deserialization
public class Singleton8 {

    static {
        System.out.println("Singleton 8");
    }
    private Singleton8() {}

    private static class Holder {
        private static final Singleton8 INSTANCE = new Singleton8();

        static {
            System.out.println("Holder for Singleton 8");
        }
    }

    public static Singleton8 getInstance() {
        return Holder.INSTANCE;
    }

    public void method() {}

}
