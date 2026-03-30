package org.patterns.sandbox.duck;

import org.patterns.sandbox.ability.Flyiable;
import org.patterns.sandbox.ability.Quackable;
import org.patterns.sandbox.ability.Swimmable;

public class RedheadDuck extends Duck implements Quackable, Swimmable, Flyiable {

    String duckType = "redhead Duck";
    String quack = "quack";

    @Override
    public void display() {
        System.out.println("This is " + duckType);
    }

    @Override
    public void quack() {
        System.out.println(quack);
    }

    public void swim(){
        System.out.println(duckType + " swimming");
    }

    public void fly(){
        System.out.println(duckType + " flying");
    }

}
