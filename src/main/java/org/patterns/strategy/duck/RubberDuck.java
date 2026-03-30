package org.patterns.sandbox.duck;

import org.patterns.sandbox.ability.Quackable;
import org.patterns.sandbox.ability.Swimmable;

public class RubberDuck extends Duck implements Quackable, Swimmable {

    String duckType = "rubber Duck";
    String quack = "squak";

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
}
