package org.patterns.strategy.duck;

public class MallardDuck extends Duck {

    String duckType = "mallard Duck";
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
