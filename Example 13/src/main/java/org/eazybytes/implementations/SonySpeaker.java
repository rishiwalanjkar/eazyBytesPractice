package org.eazybytes.implementations;

import org.eazybytes.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SonySpeaker implements Speaker {
    @Override
    public String makeSound() {
        return "Playing music using sony speaker...";
    }
}
