package org.eazybytes;

import org.eazybytes.beans.Person;
import org.eazybytes.beans.Vehicle;
import org.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext   = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person                                                           = annotationConfigApplicationContext.getBean(Person.class);
        Vehicle vehicle                                                         = annotationConfigApplicationContext.getBean("HondaAmaze", Vehicle.class);

        System.out.println("Person we are talking about is " + person);
        System.out.println("Vehicle we are driving is " + vehicle);

        annotationConfigApplicationContext.close();
    }
}