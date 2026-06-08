package org.patterns.composite.lections;

public class Leaf implements Component{

    private int value = 0;

    @Override
    public void increase() {
        value++;
    }

    @Override
    public void decrease() {
        value--;
    }

    @Override
    public int getValue() {
        return value;
    }
}
