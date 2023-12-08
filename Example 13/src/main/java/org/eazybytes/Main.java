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
        ApplicationContext applicationContext   = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person                           = applicationContext.getBean(Person.class);

        System.out.println(person.getVehicle().getVehicleService().makeSound());
        System.out.println(person.getVehicle().getVehicleService().rotate());
    }
}