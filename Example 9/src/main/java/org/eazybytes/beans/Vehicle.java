package org.eazybytes.beans;

public class Vehicle {
    String name;

    public Vehicle() {
        System.out.println("Vehicle object has been created...");
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
}
