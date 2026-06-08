package org.patterns.composite.lections;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();

        Node empty = new Node(List.of());
        Node node = new Node(List.of(leaf1, leaf2, empty));
        Node master = new Node(List.of(node, new Leaf(), leaf3));

        System.out.println(master.getValue());
        master.increase();
        System.out.println(master.getValue());
        master.increase();
        System.out.println(master.getValue());



    }
}
