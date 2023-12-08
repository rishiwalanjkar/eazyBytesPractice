package org.eazybytes.beans;

import org.eazybytes.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;

        System.out.println("Vehicle object has been created...");
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", vehicleService=" + vehicleService +
                '}';
    }
}
