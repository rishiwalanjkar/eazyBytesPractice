package org.eazybytes;

import org.eazybytes.config.ProjectConfig;
import org.eazybytes.services.VehicleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext   = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService1          = applicationContext.getBean(VehicleService.class);
        VehicleService vehicleService2          = applicationContext.getBean(VehicleService.class);

        System.out.println("Hash code for vehicleService1 is " + vehicleService1.hashCode());
        System.out.println("Hash code for vehicleService2 is " + vehicleService2.hashCode());

        if(vehicleService1 == vehicleService2)
            System.out.println(VehicleService.class + " is a Singleton class");
        else
            System.out.println(VehicleService.class + " is not a Singleton class");
    }
}