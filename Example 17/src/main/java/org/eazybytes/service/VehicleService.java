package org.eazybytes.service;

import org.eazybytes.interfaces.LogAspect;
import org.eazybytes.interfaces.Speaker;
import org.eazybytes.interfaces.Tyre;
import org.eazybytes.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    private Speaker speaker;

    @Autowired
    private Tyre tyre;

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song) {
        return speaker.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
        return tyre.rotate();
    }

    public String applyBreak(boolean vehicleStarted) {
        return tyre.stop();
    }
}
