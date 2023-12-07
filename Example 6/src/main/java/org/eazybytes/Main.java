package org.eazybytes;

import org.eazybytes.bean.Vehicle;
import org.eazybytes.config.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);

        Vehicle vehicle = applicationContext.getBean(Vehicle.class);

        System.out.println("Vehicle we are trying to drive is " + vehicle);

        applicationContext.close();
    }
}