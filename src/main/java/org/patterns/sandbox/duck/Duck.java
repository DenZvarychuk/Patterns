package org.patterns.sandbox;

public abstract class Duck {

    private String duckType = "abstract Duck";
    private String quak = "quak";

    public void display(){
        System.out.println("This is " + duckType);
    }

    protected void display(String duckType) {
        System.out.println("This is " + duckType);
    }
}
