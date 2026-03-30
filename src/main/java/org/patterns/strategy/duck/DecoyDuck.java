package org.patterns.sandbox.duck;

import org.patterns.sandbox.ability.Swimmable;

public class DecoyDuck extends Duck implements Swimmable {

    String duckType = "decoy Duck";

    @Override
    public void swim() {
        System.out.println(duckType + " swimming");
    }
}
