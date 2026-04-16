package org.patterns.strategy.ability;

public class NonFlyable implements FlyBehavior {

    String type = "";

    public NonFlyable(String type){
        this.type = type;
    }

    public NonFlyable(){
    }

    @Override
    public void fly() {
        if (type.isEmpty()) {
            System.out.println("I cannot fly!");
        } else System.out.println("I'm " + type + " and I can not fly!");
    }
}
