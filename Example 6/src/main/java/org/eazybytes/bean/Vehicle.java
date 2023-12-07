package org.eazybytes.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    String name;

    @PostConstruct
    public void initialize() {
        this.name = "Honda Amaze";

        System.out.println("Vehicle is been initialized");
        System.out.println(this);
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

        System.out.println("Destroying vehicle");
        System.out.println(this);
    }
}
