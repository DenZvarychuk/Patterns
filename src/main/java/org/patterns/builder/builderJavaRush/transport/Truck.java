package org.patterns.builder.builderJavaRush.transport;

import org.patterns.builder.builderJavaRush.creators.CourierTransport;

public class Truck implements CourierTransport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
