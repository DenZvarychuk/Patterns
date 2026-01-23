package org.patterns.sandbox;

public class RubberDuck extends Duck {

    String duckType = "rubber Duck";
    String quack = "squak";

    @Override
    public void display() {
        super.display(duckType);
    }
}
