package org.patterns.factory.factoryGuru;

import org.patterns.factory.factoryGuru.transport.CourierTransport;

public class Deliver {
    private String address;
    private CourierTransport courierTransport;

    public Deliver() {}
    public Deliver(String address, CourierTransport courierTransport) {
        this.address = address;
        this.courierTransport = courierTransport;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCourierTransport(CourierTransport courierTransport) {
        this.courierTransport = courierTransport;
    }

    public CourierTransport getCourierTransport() {
        return courierTransport;
    }
}
