package org.eazybytes.services;

import org.eazybytes.interfaces.Speaker;
import org.eazybytes.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleService {
    @Autowired
    private Speaker speaker;

    @Autowired
    private Tyre tyre;

    public VehicleService() {
        System.out.println("Vehicle service object has been created...");
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

    public String makeSound() {
        return this.makeSound();
    }

    public String rotate() {
        return this.rotate();
    }

    @Override
    public String toString() {
        return "VehicleService{" +
                "speaker=" + speaker +
                ", tyre=" + tyre +
                '}';
    }
}
