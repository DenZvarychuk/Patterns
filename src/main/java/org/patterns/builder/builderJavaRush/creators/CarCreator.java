package org.patterns.builder.builderJavaRush.creators;

import org.patterns.builder.builderJavaRush.transport.Car;

public class CarCreator  extends CourierTransportCreator{
    @Override
    public CourierTransport createTransport() {
        return new Car();
    }

}

