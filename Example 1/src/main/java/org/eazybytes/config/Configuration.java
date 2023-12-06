package org.eazybytes.config;

import org.eazybytes.bean.Vehicle;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");

        return vehicle;
    }

    @Bean
    public String hello() {
        return "Hello world";
    }

    @Bean
    public int number(){
        return 16;
    }
}
