package org.eazybytes;

import org.eazybytes.bean.Vehicle;
import org.eazybytes.config.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);

        applicationContext.registerBean("vehicle", Vehicle.class, () -> {
            Vehicle vehicle = new Vehicle();

            Random random = new Random();

            vehicle.setName(0 == random.nextInt(10) % 2 ? "Honda Amaze" : "EcoSport");

            return vehicle;
        });

        Vehicle vehicle = applicationContext.getBean("vehicle", Vehicle.class);

        System.out.println("Vehicle we are trying to drive is " + vehicle);
    }
}