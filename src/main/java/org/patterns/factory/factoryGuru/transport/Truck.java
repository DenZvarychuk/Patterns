package org.patterns.factory.factoryGuru.transport;

public class Truck implements CourierTransport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
