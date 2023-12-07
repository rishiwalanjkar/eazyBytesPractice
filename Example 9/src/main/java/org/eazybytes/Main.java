package org.eazybytes;

import org.eazybytes.beans.Person;
import org.eazybytes.beans.Vehicle;
import org.eazybytes.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = applicationContext.getBean(Person.class);
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);

        System.out.println("Details of person we are talking about are " + person);
        System.out.println("Vehicle we are trying is " + vehicle);
    }
}