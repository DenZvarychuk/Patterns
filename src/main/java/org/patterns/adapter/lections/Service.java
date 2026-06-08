package org.patterns.adapter.lections;

public class Service {

    private final Сервіс source;

    public Service(Сервіс source) {
        this.source = source;
    }

    public void service() {
        source.обслуговувати();
    }

}
