package org.patterns.singleton.lections;

// Lazy initialisation
// not realy good for mu
public class Singleton6 {

    private static Singleton6 instance = null;
    private Object lock = new Object();
    private int value;

    private Singleton6(){}

    public Singleton6 getInstance(){

        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    Singleton6 temp = new Singleton6();
                    temp.setValue(10);
                    instance = temp;
                }
            }
        }

        return instance;

    }

    private void setValue(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void method1(){}

}
