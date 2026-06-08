package org.patterns.prototype.lections;

public class Main {

    public static void main(String[] args) {

        Referat ref1 = new Referat("author", "text", new Object());
        Referat ref2 = ref1.clone();

        System.out.println(ref1.getObject() == ref2.getObject());
        System.out.println(ref1.getAuthor() == ref2.getAuthor());

    }

}
