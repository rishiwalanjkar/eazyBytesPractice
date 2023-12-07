package org.eazybytes;

import org.eazybytes.bean.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Vehicle vehicle = applicationContext.getBean(Vehicle.class);

        System.out.println("Vehicle we are trying to drive is " + vehicle);
    }
}