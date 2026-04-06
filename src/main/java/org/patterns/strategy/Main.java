package org.patterns.strategy;

import org.patterns.strategy.duck.*;

public class Main {
    public static void main(String[] args) {

        DecoyDuck decoyDuck = new DecoyDuck();
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        RedheadDuck redheadDuck = new RedheadDuck();

        System.out.println("- - - - - - - - - ");
        System.out.println(" - Redhead Duck - ");

        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.fly();

        System.out.println("\n - - - - - - - - - ");
        System.out.println(" - Rubber Duck - ");

        rubberDuck.display();
        rubberDuck.swim();

        System.out.println("\n - - - - - - - - - ");
        System.out.println(" - Mallard Duck - ");

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.fly();

        System.out.println("\n - - - - - - - - - ");
        System.out.println(" - Decoy Duck - ");

        decoyDuck.display(); //display() method is not overrated

    }
}
