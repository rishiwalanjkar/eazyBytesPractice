package org.eazybytes.implementation;

import org.eazybytes.interfaces.Speaker;
import org.eazybytes.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {
    @Override
    public String makeSound(Song song) {
        return "Playing the song " + song.getTitle() + " by "
                + song.getSingerName() +
                " with Bose Speakers";
    }
}
