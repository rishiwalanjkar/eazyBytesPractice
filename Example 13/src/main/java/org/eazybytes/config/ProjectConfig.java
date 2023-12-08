package org.eazybytes.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.eazybytes.beans", "org.eazybytes.implementations", "org.eazybytes.services"})
public class ProjectConfig {
}
