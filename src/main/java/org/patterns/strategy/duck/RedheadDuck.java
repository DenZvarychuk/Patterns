package org.patterns.strategy.duck;

public class RedheadDuck extends Duck {

    String duckType = "redhead Duck";
    String quack = "quack";

    @Override
    public void display() {
        System.out.println("This is " + duckType);
    }

    public void swim(){
        System.out.println(duckType + " swimming");
    }

    public void fly(){
        System.out.println(duckType + " flying");
    }

}
