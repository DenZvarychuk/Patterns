package org.patterns.sandbox;

public class RedheadDuck extends Duck {

    String duckType = "redhead Duck";

    @Override
    public void display() {
        super.display(duckType);
    }
}
