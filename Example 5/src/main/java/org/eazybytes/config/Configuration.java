package org.eazybytes.config;

import org.eazybytes.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "org.eazybytes.bean")
public class Configuration {

}
