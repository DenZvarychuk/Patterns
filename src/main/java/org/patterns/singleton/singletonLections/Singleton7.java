package org.patterns.singleton.singletonLections;

// can't use inheritance and can't be inherited
// can implement interfaces
// should be like anonymous class
public enum Singleton7 {
    FIRST(10){
        @Override
        public void method() {
            System.out.println("override");
        }
    };

    private final int value;

    Singleton7(int value){
        this.value = value;
    }
    public void method(){}
}
