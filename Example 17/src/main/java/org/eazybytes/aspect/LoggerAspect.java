package org.eazybytes.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* org.eazybytes.service.VehicleService.*(..))")
    public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info(proceedingJoinPoint.getSignature().toString() + " method execution started");

        Instant start = Instant.now();
        proceedingJoinPoint.proceed();
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        logger.info(proceedingJoinPoint.getSignature().toString() + " method execution end");
    }

    @Around("@annotation(org.eazybytes.interfaces.LogAspect)")
    public void logWithAnnotation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info(proceedingJoinPoint.getSignature().toString() + " method execution started");

        Instant start = Instant.now();
        proceedingJoinPoint.proceed();
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        logger.info(proceedingJoinPoint.getSignature().toString() + " method execution end");
    }

    @AfterThrowing(value = "execution(* org.eazybytes.service.VehicleService.*(..))", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        logger.log(Level.SEVERE, joinPoint.getSignature() + " An exception thrown with the help of" +
                " @AfterThrowing which happened due to : " + exception.getMessage());
    }

    @AfterReturning(value = "execution(* org.eazybytes.service.VehicleService.*(..))", returning = "retValue")
    public void logStatus(JoinPoint joinPoint, Object retValue) {
        logger.log(Level.INFO, joinPoint.getSignature() + " Method successfully processed with the status " +
                retValue.toString());
    }
}
