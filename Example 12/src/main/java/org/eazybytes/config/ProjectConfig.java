package org.eazybytes.config;

import org.eazybytes.beans.Person;
import org.eazybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Person.class)
public class ProjectConfig {
    @Bean(name = "EcoSport")
    public Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("EcoSport");

        return vehicle;
    }

    @Bean(name = "HondaAmaze")
    public Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda Amaze");

        return vehicle;
    }

    @Bean(name = "TataPunch")
    public Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Tata Punch");

        return vehicle;
    }
}
