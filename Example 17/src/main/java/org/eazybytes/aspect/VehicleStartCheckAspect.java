package org.eazybytes.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class VehicleStartCheckAspect {
    @Before("execution(* org.eazybytes.service.VehicleService.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Exception {
        if(!vehicleStarted) {
//            throw new RuntimeException("Vehicle not started");
        }
    }
}
