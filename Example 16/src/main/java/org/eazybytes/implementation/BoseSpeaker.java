package org.eazybytes.implementation;

import org.eazybytes.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speaker {
    @Override
    public String makeSound() {
        return "Playing a song using Bose Speaker";
    }
}
