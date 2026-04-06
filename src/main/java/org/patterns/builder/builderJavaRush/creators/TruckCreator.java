package org.patterns.builder.builderJavaRush.creators;

import org.patterns.builder.builderJavaRush.transport.Truck;

public class TruckCreator extends CourierTransportCreator {
    @Override
    public CourierTransport createTransport() {
        return new Truck();
    }
}
