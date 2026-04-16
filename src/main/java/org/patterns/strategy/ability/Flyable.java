package org.patterns.strategy.ability;

public class Flyable implements FlyBehavior {

    String type = "";
    public Flyable(String type) {
        this.type = type;
    }

    public Flyable(){
    }

    @Override
    public void fly() {
        if (type.isEmpty()) {
            System.out.println("I can fly!");
        } else System.out.println("I'm " + type + " and I can fly!");

    }

}
