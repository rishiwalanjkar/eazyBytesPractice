package org.eazybytes.config;

import org.eazybytes.beans.Person;
import org.eazybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda Amaze");

        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Rishikesh Walanjkar");
        person.setVehicle(vehicle);

        return person;
    }
}
