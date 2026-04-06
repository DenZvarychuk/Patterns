package org.patterns.strategy.duck;

import org.patterns.strategy.ability.FlyBehavior;

public abstract class Duck implements FlyBehavior {

    private String duckType = "abstract Duck";
    private String quak = "quak";

    public void display(){
        System.out.println("This is " + duckType);
    }

}
