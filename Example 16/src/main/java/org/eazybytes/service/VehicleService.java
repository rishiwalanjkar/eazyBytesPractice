package org.eazybytes.service;

import org.eazybytes.interfaces.Speaker;
import org.eazybytes.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {

    @Autowired
    private Speaker speaker;
    @Autowired
    private Tyre tyre;

    public VehicleService() {
        System.out.println("Vehicle Service object is created");
    }

    public void playMusic() {
        System.out.println(speaker.makeSound());
    }
    public void moveVehicle() {
        System.out.println(tyre.rotate());
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
