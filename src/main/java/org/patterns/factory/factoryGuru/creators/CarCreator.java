package org.patterns.factory.factoryGuru.creators;

import org.patterns.factory.factoryGuru.transport.Car;
import org.patterns.factory.factoryGuru.transport.CourierTransport;

public class CarCreator  extends CourierTransportCreator{
    @Override
    public CourierTransport createTransport() {
        return new Car();
    }

}

