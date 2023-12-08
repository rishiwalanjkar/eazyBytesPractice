package org.eazybytes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {
    private String name;
    private Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("EcoSport") Vehicle vehicle) {
        this.vehicle = vehicle;

        System.out.println("Person object has been created...");
    }

    @PostConstruct
    public void initialize() {
        this.name = "Rishikesh Walanjkar";

        System.out.println("Person object has been initialized... " + this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }

    @PreDestroy
    public void destroy() {
        this.name = null;
        this.vehicle = null;

        System.out.println("Person object has been destroyed... " + this);
    }
}
