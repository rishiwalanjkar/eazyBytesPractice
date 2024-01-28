package org.eazybytes;

import org.eazybytes.config.ProjectConfig;
import org.eazybytes.model.Song;
import org.eazybytes.service.VehicleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleService = applicationContext.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());
        Song song = new Song();
        song.setTitle("Pehle Bhi Main");
        song.setSingerName("Vishal");

        boolean vehicleStarted = true;
        String moveVehicleStatus    = vehicleService.moveVehicle(vehicleStarted);
        String playMusicStatus      = vehicleService.playMusic(vehicleStarted, song);
        String applyBreakStatus     = vehicleService.applyBreak(vehicleStarted);

        vehicleStarted      = false;
        moveVehicleStatus   = vehicleService.moveVehicle(vehicleStarted);
        playMusicStatus     = vehicleService.playMusic(vehicleStarted, song);
        applyBreakStatus    = vehicleService.applyBreak(vehicleStarted);
    }
}