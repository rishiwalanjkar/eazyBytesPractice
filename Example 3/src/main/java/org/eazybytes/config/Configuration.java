package org.eazybytes.config;

import org.eazybytes.bean.Vehicle;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean(name="EcoSport")
    public Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ford EcoSport");

        return vehicle;
    }

    @Bean(value="Amaze")
    public Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda Amaze");

        return vehicle;
    }

    @Bean("Punch")
    public Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Tata Punch");

        return vehicle;
    }

}
