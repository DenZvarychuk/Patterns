package org.patterns.sandbox;

import org.patterns.sandbox.duck.*;

public class Main {
    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        System.out.println("- - - - - - - - - ");
        System.out.println(" - Redhead Duck - ");

        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.fly();

        System.out.println("\n - - - - - - - - - ");
        System.out.println(" - Rubber Duck - ");

        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();

        System.out.println("\n - - - - - - - - - ");
        System.out.println(" - Mallard Duck - ");

        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();

        System.out.println("\n - - - - - - - - - ");
        System.out.println(" - Decoy Duck - ");

        decoyDuck.display(); //display() method is not overrated
        decoyDuck.swim();

    }
}
