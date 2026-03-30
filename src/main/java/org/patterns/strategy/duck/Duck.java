package org.patterns.sandbox.duck;

public abstract class Duck {

    private String duckType = "abstract Duck";
    private String quak = "quak";

    public void display(){
        System.out.println("This is " + duckType);
    }

}
