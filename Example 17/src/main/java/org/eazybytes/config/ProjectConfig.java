package org.eazybytes.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.eazybytes.implementation", "org.eazybytes.service", "org.eazybytes.aspect"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
