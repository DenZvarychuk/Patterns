package org.patterns.composite.lections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Node implements Component {

    private final List<Component> children;

    public Node(List<Component> children) {
        this.children = children == null ? List.of() : children;
    }

    @Override
    public void increase() {
        children.forEach(Component::increase);
    }

    @Override
    public void decrease() {
        children.forEach(Component::decrease);
    }

    @Override
    public int getValue() {
        return children.stream().mapToInt(Component::getValue).sum();
    }
}
