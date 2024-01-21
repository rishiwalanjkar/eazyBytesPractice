package org.eazybytes.implementation;

import org.eazybytes.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker {
    @Override
    public String makeSound() {
        return "Playing a song using Sony Speaker";
    }
}
