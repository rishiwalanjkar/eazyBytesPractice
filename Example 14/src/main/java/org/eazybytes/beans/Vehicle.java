package org.eazybytes.beans;

import org.eazybytes.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;

        System.out.println("Vehicle object has been created...");
    }

    @PostConstruct
    public void initialize() {
        this.name = "Honda Amaze";

        System.out.println("Vehicle object has been initialized... " + this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    public String makeSound() {
        return this.vehicleService.makeSound();
    }

    public String rotate() {
        return this.vehicleService.rotate();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", vehicleService=" + vehicleService +
                '}';
    }
}
