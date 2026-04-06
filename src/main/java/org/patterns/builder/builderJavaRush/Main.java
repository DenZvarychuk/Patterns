package org.patterns.builder.builderJavaRush;

import org.patterns.builder.builderJavaRush.creators.CarCreator;
import org.patterns.builder.builderJavaRush.creators.CourierTransport;
import org.patterns.builder.builderJavaRush.creators.TruckCreator;

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
