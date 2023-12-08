package org.eazybytes.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle object has been created...");
    }

    @PostConstruct
    public void initialize() {
        this.name = "Honda Amaze";

        System.out.println("Vehicle object has been initialized..." + this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    @PreDestroy
    public void destroy() {
        this.name = null;

        System.out.println("Vehicle object has been destroyed... " + this);
    }
}
