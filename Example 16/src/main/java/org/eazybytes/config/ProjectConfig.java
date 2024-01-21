package org.eazybytes.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.eazybytes.implementation", "org.eazybytes.service"})
@ComponentScan(basePackageClasses = {org.eazybytes.beans.Vehicle.class, org.eazybytes.beans.Person.class})
public class ProjectConfig {
}
