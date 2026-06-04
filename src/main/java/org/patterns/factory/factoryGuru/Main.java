package org.patterns.factory.factoryGuru;

import org.patterns.factory.factoryGuru.creators.CarCreator;
import org.patterns.factory.factoryGuru.transport.CourierTransport;
import org.patterns.factory.factoryGuru.creators.TruckCreator;

public class Main {
    public static void main(String[] args) {
        Deliver deliver1 = new Deliver();
        Deliver deliver2 = new Deliver();

        deliver1.setCourierTransport(getCourierTransport("Car"));
        deliver2.setCourierTransport(getCourierTransport("Truck"));

        deliver1.getCourierTransport().deliver();
        deliver2.getCourierTransport().deliver();
    }

    private static CourierTransport getCourierTransport(String type) {
        return switch (type){
            case "Car" -> new CarCreator().createTransport();
            case "Truck" -> new TruckCreator().createTransport();
            default -> throw new RuntimeException("Invalid type");
        };

    }

}
