package org.eazybytes;

import org.eazybytes.bean.Vehicle;
import org.eazybytes.config.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);

        Vehicle vehicle = applicationContext.getBean(Vehicle.class);

        System.out.println("Vehicle configured as " + vehicle);

        String helloWorld = applicationContext.getBean(String.class);

        System.out.println(helloWorld);

        int a = applicationContext.getBean(Integer.class);

        System.out.println("Number configured is " + a);
    }
}