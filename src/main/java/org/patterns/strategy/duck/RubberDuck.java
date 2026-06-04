package org.patterns.strategy.duck;

public class RubberDuck extends Duck  {

    String duckType = "rubber Duck";
    String quack = "squak";

    @Override
    public void display() {
        System.out.println("This is " + duckType);
    }

    public void swim(){
        System.out.println(duckType + " swimming");
    }

    @Override
    public void fly() {

    }
}
