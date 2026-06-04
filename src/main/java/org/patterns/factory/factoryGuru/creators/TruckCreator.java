package org.patterns.factory.factoryGuru.creators;

import org.patterns.factory.factoryGuru.transport.CourierTransport;
import org.patterns.factory.factoryGuru.transport.Truck;

public class TruckCreator extends CourierTransportCreator {
    @Override
    public CourierTransport createTransport() {
        return new Truck();
    }
}
