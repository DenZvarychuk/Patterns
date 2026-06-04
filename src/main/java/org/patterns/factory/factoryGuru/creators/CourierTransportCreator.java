package org.patterns.factory.factoryGuru.creators;

import org.patterns.factory.factoryGuru.transport.CourierTransport;

public abstract class CourierTransportCreator {
    public abstract CourierTransport createTransport();
}
