package org.patterns.factory.factoryGuru.transport;

public class Car implements CourierTransport {
    @Override
    public void deliver() {
        System.out.println("Delivering by car");
    }
}
