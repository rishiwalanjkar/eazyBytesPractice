package org.eazybytes.implementations;

import org.eazybytes.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {
    @Override
    public String makeSound() {
        return "Playing music with Bose Speaker...";
    }
}
